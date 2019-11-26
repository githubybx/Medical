package com.example.demo.SendEmail;

import com.zhenzi.sms.ZhenziSmsClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class EmailClient {
    @Bean
    public ZhenziSmsClient sendMsg(){
        return new ZhenziSmsClient("https://sms_developer.zhenzikj.com","wxcda13525f2112607","ec0561cfd54fa8683511e6556191efdd");
    }
}
