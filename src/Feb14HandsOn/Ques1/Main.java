package Feb14HandsOn.Ques1;

public class Main {


    public static void main(String[] args) {
        String[] batchId = {"ACD22XD", "ACD21DD", "ACD21FD", "ACD22ED", "KCC22XD", "KCD22XD", "KCD22XD"};
        int i = 0;
        for (String id : batchId) {
            if (id.contains("22")) {
                i++;
                System.out.println(id);
            }
        }
        System.out.println("Total Year-22 Batch: " + i +" out of "+batchId.length);


    }


}
