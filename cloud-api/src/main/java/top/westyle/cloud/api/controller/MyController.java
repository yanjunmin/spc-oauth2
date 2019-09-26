package top.westyle.cloud.api.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping(value = "/private/{id}")
    public String api(@PathVariable  String id){
        return "success: " + id;
    }
}
