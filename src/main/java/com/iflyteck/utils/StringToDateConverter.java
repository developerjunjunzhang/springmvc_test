package com.iflyteck.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) {
        if (source == null) {
            throw new RuntimeException("未传入参数");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = df.parse(source);
            return date;
        } catch (Exception e) {
            throw new RuntimeException("数据类型转换异常！");
        }
    }
}
