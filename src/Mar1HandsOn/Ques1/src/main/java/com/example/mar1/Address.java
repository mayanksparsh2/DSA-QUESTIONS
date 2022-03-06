package com.example.mar1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="address")
public class Address {
    @Id
    @Column(name="Aid")
    private int addressid;
    @Column(name="street")
    private String street;
    @Column(name="state")
    private String state;
    @Column(name="city")
    private String city;
    @OneToOne(targetEntity=Student.class)
    private Student student;
    public int getAddressid() {
        return addressid;
    }
    public void setAddressid(int addressid) {
        this.addressid = addressid;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
}