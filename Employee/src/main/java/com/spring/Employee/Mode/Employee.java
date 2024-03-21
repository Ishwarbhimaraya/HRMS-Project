package com.spring.Employee.Mode;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid")
    private int EId;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "emp_code")
    private String emp_code;
    @Column(name = "email")
    private String email;

    @Override
    public String toString() {
        return "Employee{" +
                "EId=" + EId +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", emp_code='" + emp_code + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Employee(int EId, String first_name, String last_name, String emp_code, String email) {
        this.EId = EId;
        this.first_name = first_name;
        this.last_name = last_name;
        this.emp_code = emp_code;
        this.email = email;
    }

    public int getEId() {
        return EId;
    }

    public void setEId(int EId) {
        this.EId = EId;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmp_code() {
        return emp_code;
    }

    public void setEmp_code(String emp_code) {
        this.emp_code = emp_code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
