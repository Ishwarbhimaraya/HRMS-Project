package com.spring.Organization.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="company")
public class Company {

    public int getCId() {
        return CId;
    }

    public void setCId(int CId) {
        this.CId = CId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid")
    private int CId;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "code")
    private String code;

    public Company() {

    }

    public Company(int CId, String name, String address, String code) {
        this.CId = CId;
        this.name = name;
        this.address = address;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Company{" +
                "CId=" + CId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
