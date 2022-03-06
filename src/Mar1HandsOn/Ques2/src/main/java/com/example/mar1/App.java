package com.example.mar1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App
{
    public static void main( String[] args )
    {
        Configuration cfg= new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory= cfg.buildSessionFactory();
        Session session= factory.openSession();
        Transaction t= session.beginTransaction();

        Department department = new Department();
        department.setDepartmentName("Sales");
        session.save(department);

        Employee emp1 = new Employee("Mayank", "Sparsh", "7739837201");
        Employee emp2 = new Employee("Sanjay", "Kumar", "123123123");

        emp1.setDepartment(department);
        emp2.setDepartment(department);

        session.save(emp1);
        session.save(emp2);

        session.getTransaction().commit();
        session.close();


    }
}