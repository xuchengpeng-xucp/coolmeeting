package org.javablacksmith.meeting.mapper;

import org.javablacksmith.meeting.model.Department;

/**
 * <pre>
 * @projectName: org.javablacksmith.coolmeeting
 * @packageName: org.javablacksmith.meeting.mapper
 * @interfaceName:
 * @description:
 * @author: Xucp
 * @date: 2022/4/11
 * </pre>
 */
public interface DepartmentMapper {
    /**
     * 获取ID
     * @param id
     * @return
     */
    Department getDepById(Integer id);
}
