package  Feb7HandsOn.Ques3;
import java.util.*;

//WAP IN JAVA FOR HOTEL TO ORDER THE DISHES AND USER CAN ORDER THE SOUTH INDIAN, NORTH INDIAN, RAJASTHANI
//GUJRATI, BANGALI DISH, DESERTS

//DISHES NAME AND PRICE

public class Main {
    static String[] menuHead = {"South Indian", "North Indian", "Rajasthani", "Gujrati", "Bangali", "Desert"};
    static ArrayList<Dishes> selectedDishes = new ArrayList<>();
    static ArrayList<Dishes> dishes = new ArrayList<>();

    public static void main(String[] args) {


        System.out.println("\n****** HOTEL TAJ MENU ******\n");
        inflateMenu();

        System.out.println("\n\nPlease select item by its serial no");
        takeOrder();

    }

    static void inflateMenu() {
        int count = 1;
        for (int i = 0; i < menuHead.length; i++) {
            System.out.println("======= " + menuHead[i] + " =======");
            for (int j = 1; j < 5; j++) {
                Dishes d = new Dishes();
                int rupee=(int)( Math.random()*200+100);
                System.out.println(count + ") " + menuHead[i] + " item " + j + " ₹" +rupee);
                d.setCategory(i);
                d.setItemName(menuHead[i] + " item " + j);
                d.setPrice(rupee);
                dishes.add(d);
                count++;
            }
        }


    }

    static void takeOrder() {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int f = 0;
        boolean flag=false;
        do {
            try {
                System.out.println("\nPlease Select the item or Press 0 to finish\n");
                f = sc.nextInt();
                if (f == 0) {
                    break;
                }
                sum += dishes.get(f - 1).getPrice();
                selectedDishes.add(dishes.get(f - 1));
                System.out.println(dishes.get(f - 1).itemName + "--- Added to cart. Total Order Value: " + sum);
                if (sum > 500 && !flag) {
                    flag=true;
                    System.out.println("As your order is above 500 we are giving you -> " + dishes.get(dishes.size() - 1).itemName + " <- as complementary.");
                }

            } catch (Exception e) {
                System.out.println("Error while adding..please try again \n(Value should be between 1 to " + dishes.size() + ")");
            }
        } while (f != 0);

    }
}








