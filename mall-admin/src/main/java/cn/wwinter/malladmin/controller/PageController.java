package cn.wwinter.malladmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName: PageController
 * Package: cn.wwinter.malldemo.controller
 * Description:
 * Datetime: 2023/11/28
 * Author: zhangdd
 */
@Controller
public class PageController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/index")
    public String index() {
        return "index";
    }
    @GetMapping("/crud")
    public String crud() {
        return "crud";
    }
}
