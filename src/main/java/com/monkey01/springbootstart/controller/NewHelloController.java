package com.monkey01.springbootstart.controller;

import com.monkey01.springbootstart.bean.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-start
 * @description: 在较新的spring版本中，出了几个新的注解，简化了上面的用法
 * @author: Mr.Zhang
 * @create: 2018-10-13 14:05
 **/
    //@Controller+@ResponseBody组合，相当于在每个方法都加上@ResponseBody。
    @RestController
    public class NewHelloController {
        //直接指定Post请求，同样也有@GetMapping
        @PostMapping("/url")
        //@RequestBody是指请求来的参数是json请求体，以json格式来转换到uer
        public String hello(@RequestBody User user){
            return "hello world";
        }
    }


