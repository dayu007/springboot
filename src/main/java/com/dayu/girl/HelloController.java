package com.dayu.girl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dayu.girl.poji.IMoocJSONResult;
import com.dayu.girl.poji.Resource;

@RestController
public class HelloController {

    @Autowired
    private Resource resource;

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping("/hello")
    public String say() {
        return "hello world!";
    }

    @GetMapping("/getResource")
    public IMoocJSONResult getResource() {

        Resource bean = new Resource();
        BeanUtils.copyProperties(resource, bean);
        return IMoocJSONResult.ok(bean);
    }
}
