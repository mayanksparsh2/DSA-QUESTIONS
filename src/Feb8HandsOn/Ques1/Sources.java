package  Feb8HandsOn.Ques1;

class Sources extends proteins {
    public Sources() {
        System.out.println("Milk is a great source of protein");
    }

    public Sources(String source2) {
        this();
        System.out.println(source2 + " is also a great source of protein");
    }

    public Sources(String source2, String source3) {
        this(source2);
        System.out.println(source3 + " is also a great source of protein");
        displayBenefits();
    }

}
