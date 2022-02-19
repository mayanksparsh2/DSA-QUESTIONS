package Feb8HandsOn.Ques5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Flipkart {
    static Map<String, ArrayList<Flipkart>> flipkart = new HashMap<>();
    private String item;
    private int price;
    private int disc;
    private String catagory;
    private String review;

    public Flipkart() {
    }

    public void inflateData(ArrayList<Flipkart> f) {
        for (Flipkart ff : f) {
            if(flipkart.containsKey(ff.catagory)){
                ArrayList<Flipkart>arrayList=flipkart.get(ff.catagory);
                arrayList.add(ff);
                flipkart.put(ff.catagory,arrayList);
            }else {
                ArrayList<Flipkart>arrayList=new ArrayList<>();
                arrayList.add(ff);
                flipkart.put(ff.catagory,arrayList);
            }
        }
    }

    public Flipkart(String item, int price, int disc, String category, String review) {
        this.item = item;
        this.price = price;
        this.disc = disc;
        this.catagory = category;
        this.review = review;
    }

    public void display() {
        for (String cat : flipkart.keySet()) {
            System.out.println(cat);
            for (Flipkart f : flipkart.get(cat)) {
                System.out.println("\t Item: " + f.item+ " ₹"+f.price);
                System.out.println("\t\t Review: " + f.review);

            }


        }


    }
}
