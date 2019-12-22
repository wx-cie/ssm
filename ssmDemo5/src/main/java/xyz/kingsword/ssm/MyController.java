package xyz.kingsword.ssm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/test")
    public String test() {
        System.out.println(666);
        return "index";
    }
}
