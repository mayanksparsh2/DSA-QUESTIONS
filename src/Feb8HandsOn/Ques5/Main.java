package Feb8HandsOn.Ques5;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        Flipkart flipkart1 = new Flipkart("Laptop", 200000, 2, Catagories.Digital.toString(), "Very Nice Product");
        Flipkart flipkart2 = new Flipkart("Ipad", 150000, 2, Catagories.Digital.toString(), "Very Nice ");
        Flipkart flipkart3 = new Flipkart("Tea", 200, 2, Catagories.Kitchen.toString(), "Very Nice Tea");
        Flipkart flipkart4 = new Flipkart("Pen", 20, 2, Catagories.Stationary.toString(), "Very Nice Pen");

        ArrayList<Flipkart> f = new ArrayList<>();
        Flipkart obj = new Flipkart();
        f.add(flipkart1);
        f.add(flipkart2);
        f.add(flipkart3);
        f.add(flipkart4);

        obj.inflateData(f);
        obj.display();

    }
}
