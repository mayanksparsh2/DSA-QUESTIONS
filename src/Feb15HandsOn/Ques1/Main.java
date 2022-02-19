package  Feb15HandsOn.Ques1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {
        Developer developer1=new Developer(1,"Mayank",5,300000);
        Developer developer2=new Developer(2,"Sparsh",2,100000);
        Developer developer3=new Developer(3,"Karan",1,300000);
        Developer developer4=new Developer(4,"Ram",0,200000);
        Developer developer5=new Developer(5,"Raju",3,250000);
        Developer developer6=new Developer(6,"Gaurav",5,340000);
        Developer developer7=new Developer(6,"Arjun",5,340000);
        ArrayList<Developer> developers=new ArrayList<>();
        developers.add(developer1);
        developers.add(developer2);
        developers.add(developer3);
        developers.add(developer4);
        developers.add(developer5);
        developers.add(developer6);
        developers.add(developer7);

        System.out.println("Sort By Experience");
        Collections.sort(developers,new byExp());
        System.out.println(developers);

        System.out.println("Sort By Salary");
        Collections.sort(developers,new bySal());
        System.out.println(developers);

        System.out.println("Sort By Name");
        Collections.sort(developers);
        System.out.println(developers);



    }




}
