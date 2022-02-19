package  Feb9HandsOn.Ques5;

class testClass implements in1 {
    public void display(int k) {
        int count = 0, prime = 1;
        for (int i = 3; i <= k; i++) {
            count = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0)
                prime++;
        }
        System.out.println(prime);
    }
}
