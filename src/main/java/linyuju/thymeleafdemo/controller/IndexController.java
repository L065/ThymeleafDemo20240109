package linyuju.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller


public class IndexController
{
    @GetMapping("/index")
    public String index(Model model) //結合 th:replace 把 model 接起來
    {
        model.addAttribute("name","全國電子");
        model.addAttribute("url","https://ec.elifemall.com.tw/");
        return "index";
    }
}
