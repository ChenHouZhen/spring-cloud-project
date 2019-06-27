package com.chenhz.util.valid.strategy;


import com.chenhz.util.valid.annotation.MultipartFileValid;
import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

public class MultipartFileValidStrategy implements ValidStrategy {
    @Override
    public void doOperation(Object target, Object targetAnnotaions) {
        MultipartFile arg = (MultipartFile) target;
        MultipartFileValid multipartFileValid = (MultipartFileValid) targetAnnotaions;
        if (arg == null) {
            throw new IllegalArgumentException(multipartFileValid.message());
        }
        String suffix = FilenameUtils.getExtension(arg.getOriginalFilename());
        if (!multipartFileValid.type().contains(suffix.toLowerCase())) {
            throw new IllegalArgumentException("文件格式不对");
        }
        if (multipartFileValid.size() == 0){
            return;
        }
        if (multipartFileValid.size() < arg.getSize()){
            throw new IllegalArgumentException("文件过大");
        }
    }
}