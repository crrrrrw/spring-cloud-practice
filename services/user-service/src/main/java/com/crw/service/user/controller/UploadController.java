package com.crw.service.user.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {

    /**
     * 上传文件
     *
     * @param file
     * @return
     */
    @PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String uploadFile(@RequestPart(value = "file") MultipartFile file) {
        return file.getName();
    }

}
