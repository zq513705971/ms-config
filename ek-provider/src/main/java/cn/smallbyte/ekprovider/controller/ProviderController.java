package cn.smallbyte.ekprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @GetMapping("/hello/{name}")
    public @ResponseBody String hello(@PathVariable("name") String name) {
        String result = "Hello " + name;
        return result;
    }

    @GetMapping("/")
    public @ResponseBody String test() {
        return "test! ";
    }
}