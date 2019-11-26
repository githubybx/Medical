package com.example.demo.UserTable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.RequestWrapper;

@RestController
public class UserController {;
    @Autowired
    UserService userService;
    @RequestMapping("/login")
    public boolean login(@RequestParam(value = "phone",required = false)String phone, @RequestParam(value = "pass",required = false)String pass, Model model, HttpServletResponse response){
        response.setContentType("text/html;charset=utf-8");
        /* 设置响应头允许ajax跨域访问 */
        response.setHeader("Access-Control-Allow-Origin", "*");
        /* 星号表示所有的异域请求都可以接受， */
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");
        User select = null;
        if(phone != null && pass != null) {
            select = userService.select(phone, pass);
            System.out.println(phone + " " + pass);
        }
        if(select != null){
            System.out.println("登陆成功");
            System.out.println(select.getPhone() + " " + select.getPass() + " " +select.sid);
            return true;
        }else {
            System.out.println("登录失败");
            return false;
        }
    }
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("helo");
        return "大家好";
    }
    @RequestMapping("/judgeMsg")
    public int judgeMsgIsError(@RequestParam("phone")String phone){
        User user = userService.selectPhone(phone);
        if(user == null){
            System.out.println(0+"未注册");
            return 0;
        }else {
            System.out.println(1+"注册");
            return 1;
        }
    }
    @RequestMapping("/storeUser")
    public void store(@RequestParam("phone")String phone,@RequestParam("password")String password){
        userService.insert(phone,password);
        User user = userService.selectPhone(phone);
        System.out.println("插入的数据是" + user.getPhone() + " " + user.getPass());
    }
}
