package org.javablacksmith.meeting.model;

/**
 * <pre>
 * @projectName: org.javablacksmith.coolmeeting
 * @packageName: org.javablacksmith.meeting.model
 * @interfaceName:
 * @description:
 * @author: Xucp
 * @date: 2022/4/11
 * </pre>
 */
public class Department {
    private Integer departmentid;
    private String departmentname;

    @Override
    public String  toString() {
        return "Department{" +
                "departmentid=" + departmentid +
                ", departmentname='" + departmentname + '\'' +
                '}';
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }
}
