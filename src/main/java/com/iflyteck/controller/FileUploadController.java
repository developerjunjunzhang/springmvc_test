package com.iflyteck.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@RequestMapping("/file")
@Controller
public class FileUploadController {
    /**
     * 原生方式实现文件上传
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping("/fileUploadOrigin")
    public String fileUploadOrigin (HttpServletRequest request) throws Exception {
        System.out.println("fileUploadOrigin!!!");
        // 删除位置
        String realPath = request.getSession().getServletContext().getRealPath("/uploads/");
        System.out.println(realPath);
        File file = new File(realPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        // 解析request对象，获取文件上传项
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        List<FileItem> fileItems = upload.parseRequest(request);
        for (FileItem fileItem : fileItems) {
            if (fileItem.isFormField()) {
                // 普通表单项
            } else {
                // 文件上传项
                // 获取上传文件的名称
                String fileName = fileItem.getName();
                // 把文件名称设置为唯一值
                String uuid = UUID.randomUUID().toString().replace("-", "");
                fileName = uuid + "_" + fileName;
                // 完成文件上床
                fileItem.write(new File(realPath, fileName));
                // 删除临时文件
                fileItem.delete();
            }
        }
        return "success";
    }

    /**
     * SpringMvc实现文件上传
     * @param upload  注意MultipartFile的对象名必须和表单中的file的名字一致
     * @return
     * @throws Exception
     */
    @RequestMapping("/fileUploadSpringMvc")
    public String fileUploadSpringMvc (HttpServletRequest request, MultipartFile upload) throws Exception {
        System.out.println("fileUploadSpringMvc!!!");
        String realPath = request.getSession().getServletContext().getRealPath("/uploads/");
        System.out.println(realPath);
        File file = new File(realPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        String filename = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid + "_" + filename;
        // 完成文件上传
        upload.transferTo(new File(realPath, filename));
        return "success";
    }

    /**
     * 跨服务器文件上传
     * @param upload  注意MultipartFile的对象名必须和表单中的file的名字一致
     * @return
     * @throws Exception
     */
    @RequestMapping("/fileUploadToServer")
    public String fileUploadToServer (HttpServletRequest request, MultipartFile upload) throws Exception {
        System.out.println("fileUploadToServer!!!");
        // 定义上传文件服务器路径
        String path = "http://localhost:9090/uploads/";
        String filename = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid + "_" + filename;
        // 完成跨服务器文件上传
        // 创建客户端的对象
        Client client = Client.create();
        // 和图片服务器连接
        WebResource resource = client.resource(path + filename);
        // 上传文件
        resource.put(upload.getBytes());
        return "success";
    }
}
