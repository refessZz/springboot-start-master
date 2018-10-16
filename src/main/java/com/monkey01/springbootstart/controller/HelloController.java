package com.monkey01.springbootstart.controller;


import org.springframework.stereotype.Controller;

//注册一个spring控制层bean
@Controller
public class HelloController {
  /*  //配置方法的post请求url
    @RequestMapping(value= "/url",method= RequestMethod.POST)
    //@ResponseBody是将这个方法的返回值转换成特定格式，默认是json
    @ResponseBody
    //user用来接收前端请求的相关传参，比如form表单中的参数
    public String hello(User user){
        return "hello world";   //这个返回值就是前端ajax请求rest的返回值
    }*/
}
