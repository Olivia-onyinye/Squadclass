package models;

import enums.Department;

public class Staff {
    private Integer id;
    private String name;
    private Department department;

    public Staff() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Staff(Integer id, String name, Department department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
}
