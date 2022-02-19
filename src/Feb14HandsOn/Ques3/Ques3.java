package  Feb14HandsOn.Ques3;


import java.util.*;

class NewEmployee {
    String name;
    int id;
    int salary;
    int experience;
    String skillSet;

    public NewEmployee(String name, int id, int salary, int experience, String skillSet) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.experience = experience;
        this.skillSet = skillSet;
    }
}

class OldEmployee {
    String name;
    int id;
    int salary;
    int experience;
    String skillSet;

    public OldEmployee(String name, int id, int salary, int experience, String skillSet) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.experience = experience;
        this.skillSet = skillSet;
    }
}

public class Ques3 {
    public static void main(String[] args) {
        NewEmployee new1 = new NewEmployee("Mayank", 1001, 200000, 2, "Java");
        NewEmployee new2 = new NewEmployee("Sparsh", 1002, 300000, 2, "Python");
        NewEmployee new3 = new NewEmployee("Mahesh", 1003, 400000, 2, "C++");
        NewEmployee new4 = new NewEmployee("Gaurav", 1004, 500000, 2, "Angular");
        NewEmployee new5 = new NewEmployee("Rahul", 106, 600000, 2, "Php");
        OldEmployee old1 = new OldEmployee("Mangal", 1005, 100000, 2, "Java");
        OldEmployee old2 = new OldEmployee("Shubham", 1006, 200000, 2, "Python");
        OldEmployee old3 = new OldEmployee("Mohan", 1007, 300000, 2, "C++");
        OldEmployee old4 = new OldEmployee("Abhay", 1008, 400000, 2, "Angular");
        OldEmployee old5 = new OldEmployee("Gautam", 107, 500000, 2, "Php");

        HashSet<Object> EmployeeSet = new HashSet<>();
        EmployeeSet.add(new1);
        EmployeeSet.add(new2);
        EmployeeSet.add(new3);
        EmployeeSet.add(new4);
        EmployeeSet.add(new5);
        EmployeeSet.add(old1);
        EmployeeSet.add(old2);
        EmployeeSet.add(old3);
        EmployeeSet.add(old4);
        EmployeeSet.add(old5);

        Set<String> skillSetWithJava = new HashSet<>();
        System.out.println("Total no of employees: " + EmployeeSet.size());
        Object forRemoval = null;
        for (Object o : EmployeeSet) {
            if (o.getClass() == NewEmployee.class) {
                if (((NewEmployee) o).id == 106) {
                    System.out.println("Removed id 106");
                    forRemoval=o;
                }
                if (((NewEmployee) o).skillSet.contains("Java")) {
                    skillSetWithJava.add(((NewEmployee) o).name);
                }
            } else {
                if (((OldEmployee) o).id == 106) {
                    forRemoval=o;
                    System.out.println("Removed id 106");
                }
                if (((OldEmployee) o).skillSet.equals("Java")) {
                    skillSetWithJava.add(((OldEmployee) o).name);
                }
            }
        }
        
        EmployeeSet.remove(forRemoval);
        for (String s : skillSetWithJava) {
            System.out.println("Skill set with Java :" + s);
        }



    }
}