package com.afz.account.Controller;

import com.afz.account.Service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class HelloController {
    HelloService hello;
    public HelloController(HelloService hello) {
        this.hello=hello;
    }

    @GetMapping("/Msg")
    public Map<String, String> sayHello(){
    return Map.of("message", hello.getMsg());
    }
}
