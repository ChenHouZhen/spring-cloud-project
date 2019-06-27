package com.chenhz.uac.web.controller;

import com.chenhz.base.R;
import com.chenhz.uac.web.controller.form.HelloForm;
import com.chenhz.util.valid.annotation.NotNullValid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @PostMapping("/save")
    public R save(@RequestBody HelloForm helloForm){
        log.info("参数：{}",helloForm);
        return R.ok("接受成功").put("data",helloForm);
    }

    @GetMapping("/get")
    public R get(@NotNullValid String id){
        log.info("参数：{}",id);
        return R.ok("接受成功").put("data",id);
    }
}
