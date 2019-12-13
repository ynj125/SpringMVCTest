package cn.edu.hqu.javaee.web.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.hqu.javaee.ex2.domain.User;

/**
 * UserController 是一个基于注解的控制器
 * 可以同时处理多个请求动作
 */

@SpringBootApplication(scanBasePackages = "cn.edu.hqu.javaee.web.controller")
@Controller
public class UserController {
	public static void main(String[] args) {
        SpringApplication.run(UserController.class, args);
	}

    /**
    * RequestMapping 用来映射一个请求和请求的方法
    * value="/register" 表示请求由 register 方法进行处理
    */
    @RequestMapping(value="/register")
    public String Register(@ModelAttribute("form") User user, Model model) {  
	model.addAttribute("user", user);
        return "/success.html";
    }
}
