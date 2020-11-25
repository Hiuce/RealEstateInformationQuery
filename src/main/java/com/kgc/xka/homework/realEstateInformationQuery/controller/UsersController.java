package com.kgc.xka.homework.realEstateInformationQuery.controller;

import com.kgc.xka.homework.realEstateInformationQuery.pojo.Users;
import com.kgc.xka.homework.realEstateInformationQuery.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class UsersController {
    @Resource
    UsersService usersService;

    @RequestMapping("index.do")
    public String index(){
        return "login";
    }
    @RequestMapping("login.do")
    public String selectUser(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        String carId = request.getParameter("carId");
        String password = request.getParameter("password");
        Users users = usersService.selectUser(carId);
        if(users!=null){
            model.addAttribute("users",users);
            return "main";
        }else{
            PrintWriter out = response.getWriter();
            out.print("<script>alert('该账号不存在，请先注册！')</script>");
            out.flush();
            return "login";
        }
    }
    @RequestMapping("/register.do")
    public String register() {
        return "register";
    }

    @RequestMapping("/doregister.do")
    public String doregister(String cardid, String name, String password, PrintWriter out) {
        Users users = new Users();
        users.setCarid(cardid);
        users.setName(name);
        users.setPassword(password);
        users.setStatus(1);
        String gend = cardid.substring(17);
        if (gend != null) {
            int gender = Integer.parseInt(gend);
            if (gender % 2 == 0) {
                users.setGender(0);
            } else {
                users.setGender(1);
            }
        }
        if (usersService.addUser(users) > 0) {

            out.print("<script>var flag=confirm('注册成功，现在去登录吗');if(flag){location.href='login.do'}else{location.href='register.do'}</script>");
        } else {
            out.print("<script>alert('注册失败，请重新注册');location.href='login.do'</script>");
        }
        return "login";
    }

}
