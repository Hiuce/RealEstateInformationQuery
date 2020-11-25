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

}
