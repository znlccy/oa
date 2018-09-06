package com.youda.oa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class OaApplication {

    @RequestMapping(value = "index")
    public String index() {
        return "nihao";
    }

    public static void main(String[] args) {
        SpringApplication.run(OaApplication.class, args);
    }
}
