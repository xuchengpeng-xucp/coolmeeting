package org.javablacksmith.meeting.controller;

import org.javablacksmith.meeting.model.Department;
import org.javablacksmith.meeting.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 * @projectName: org.javablacksmith.coolmeeting
 * @packageName: org.javablacksmith.meeting.controller
 * @interfaceName:
 * @description:
 * @author: Xucp
 * @date: 2022/4/11
 * </pre>
 */

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/dep")
    public void getDepById(Integer id){
        Department dep = departmentService.getDepById(id);
        System.out.println("dep = "+dep);
    }

}
