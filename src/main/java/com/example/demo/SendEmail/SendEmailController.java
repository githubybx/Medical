package com.example.demo.SendEmail;

import com.zhenzi.sms.ZhenziSmsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class SendEmailController {
    @Autowired
    ZhenziSmsClient sendMsg;
    @RequestMapping("/sendMessage")
    public void send(@RequestParam("phone") String number) throws Exception {
        UUID uuid = UUID.randomUUID();
        String s = uuid.toString();
        String s1 = s.substring(0, 6).replaceAll("-", "");
        String send = sendMsg.send(number, "您的验证码是:" + s1);
        System.out.println(send);
        System.out.println("发送");
    }
}
