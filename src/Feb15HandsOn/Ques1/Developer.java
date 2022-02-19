package  Feb15HandsOn.Ques1;

import java.util.Comparator;

public class Developer implements Comparable {
    int id;
    String name;
    int experience;
    int salary;

    public Developer(int id, String name, int experience, int salary) {
        this.id = id;
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }
    @Override
    public int compareTo(Object o) {
        return name.compareTo(((Developer)o).name);
    }

    @Override
    public String toString() {
        return ("\nID: "+id+
                " Name: "+ name.toString()+
                " Experience: "+experience+
                " Salary: "+salary);
    }
}

class byExp implements Comparator<Developer>{
    @Override
    public int compare(Developer o1, Developer o2) {
        return o1.experience-o2.experience;
    }
}
class bySal implements Comparator<Developer>{
    @Override
    public int compare(Developer o1, Developer o2) {
        return o1.salary-o2.salary;
    }
}
