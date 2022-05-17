package org.javablacksmith.meeting.controller;

import org.javablacksmith.meeting.mapper.EmployeeMapper;
import org.javablacksmith.meeting.model.Employee;
import org.javablacksmith.meeting.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <pre>
 * @projectName: org.javablacksmith.coolmeeting
 * @packageName: org.javablacksmith.meeting.controller
 * @interfaceName:
 * @description:
 * @author: Xucp
 * @date: 2022/5/6
 * </pre>
 */
@Controller
public class LoginController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/")
    public String login(){
        return "login";
    }

    public String doLogin(String username, String password, Model model){
        Employee  employee = employeeService.doLogin(username,password);
        if(employee == null){
            model.addAttribute("error","用户名或者密码输入错误，登陆失败");
            return "forward:/";
        }
        return  null;

    }
}
