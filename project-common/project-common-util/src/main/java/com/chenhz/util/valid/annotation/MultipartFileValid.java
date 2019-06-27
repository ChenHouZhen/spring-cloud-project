package com.chenhz.util.valid.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 上传文件验证注解
 * 使用方法：@MultipartFileValid(type = ".jpg")
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface MultipartFileValid {
    String message() default "上传文件不能为空";
    String type(); //上传类型后缀，例如.jpg，多个用竖线隔开，例如.jpg|.png
    long size() default 0;//上传大小，0：表示没限制,单位 字节， 取M可以用 M * 1024 *1024
}