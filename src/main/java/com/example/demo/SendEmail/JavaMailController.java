package com.example.demo.SendEmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class JavaMailController {
    @Autowired
    JavaMailSender javaMailSender;
    @RequestMapping("/sendMail")
    public String sendMail () throws MailException {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("401129874@qq.com");
        simpleMailMessage.setTo("401129874@qq.com");
        simpleMailMessage.setSubject("验证码");
        int i = new Random().nextInt(899999);
        int i1 = i + 10000;
        simpleMailMessage.setText("您的验证码是:" + i1);
        javaMailSender.send(simpleMailMessage);
        String str = i1 + "";
        System.out.println(str);
        return  str;
    }
}
