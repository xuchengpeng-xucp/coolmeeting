package org.javablacksmith.meeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 * @projectName: org.javablacksmith.coolmeeting
 * @packageName: org.javablacksmith.meeting.controller
 * @interfaceName:
 * @description:
 * @author: Xucp
 * @date: 2022/3/22
 * </pre>
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("hello","hello world");
        return "hello";
    }
}
