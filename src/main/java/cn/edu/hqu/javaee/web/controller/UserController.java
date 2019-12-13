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
 * UserController ��һ������ע��Ŀ�����
 * ����ͬʱ������������
 */

@SpringBootApplication(scanBasePackages = "cn.edu.hqu.javaee.web.controller")
@Controller
public class UserController {
	public static void main(String[] args) {
        SpringApplication.run(UserController.class, args);
	}

    /**
    * RequestMapping ����ӳ��һ�����������ķ���
    * value="/register" ��ʾ������ register �������д���
    */
    @RequestMapping(value="/register")
    public String Register(@ModelAttribute("form") User user, Model model) {  // user:��ͼ�㴫�����Ʋ�ı�����model�����Ʋ㷵�ظ���ͼ��Ķ���
        // �� model �����һ����Ϊ "user" �� user ����
        model.addAttribute("user", user);
        
        // ����һ���ַ��� " success" ��Ϊ��ͼ����
        return "/success.html";
    }
}