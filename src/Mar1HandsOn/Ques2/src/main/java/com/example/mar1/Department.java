package com.example.mar1;



import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="DEPARTMENT")
public class Department {

    @Id
    @GeneratedValue
    @Column(name="DEPARTMENT_ID")
    private Long departmentId;

    @Column(name="DEPT_NAME")
    private String departmentName;

    @OneToMany(mappedBy="department")
    private Set<Employee> employees;

    // Getter and Setter methods

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}