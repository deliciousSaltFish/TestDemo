package com.james.controller;

import com.james.dao.apiDao;
import com.james.sevice.ServiceImp.MybatisServiceImp;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/test")
public class apiContriller {
    @Autowired
    MybatisServiceImp mybatisServiceImp;

    //返回数据
    @RequestMapping("/queryCurrDate")
    public void queryCurrDate(HttpServletRequest request, HttpServletResponse response) {

        String str = mybatisServiceImp.queryCurrDate();
        System.out.println(str);
        String json = "Hello World";
        response.setCharacterEncoding("UTF-8");
        PrintWriter out;
        try {
            out = response.getWriter();
            out.println(json);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //返回连接的同时返回数据
    @RequestMapping("/returnURL")
    public String returnURL(HttpServletRequest request, HttpServletResponse response) {
        String name = "JAMES";
        response.setCharacterEncoding("UTF-8");
        PrintWriter out;
        try {
            out = response.getWriter();
            out.write(name);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str = "WEB-INF/jsp/name";
        return str;
    }
    //测试github
}
