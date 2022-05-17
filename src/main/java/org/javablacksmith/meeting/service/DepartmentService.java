package org.javablacksmith.meeting.service;

import org.javablacksmith.meeting.mapper.DepartmentMapper;
import org.javablacksmith.meeting.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <pre>
 * @projectName: org.javablacksmith.coolmeeting
 * @packageName: org.javablacksmith.meeting.service
 * @interfaceName:
 * @description:
 * @author: Xucp
 * @date: 2022/4/11
 * </pre>
 */
@Service
public class DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    public Department getDepById(Integer id){
        return departmentMapper.getDepById(id);
    }


}
