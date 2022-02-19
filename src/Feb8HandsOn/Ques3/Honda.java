package  Feb8HandsOn.Ques3;

// Class Vehicle ---> Class Car extends Vehicle ---> Class Maruti extends Car
class Honda extends Car {
    void hp() {
        System.out.println("My car is of 2400hp     --->Honda Class");
    }

    void features() {
        System.out.println("Full Featured           --->Honda Class");
    }

    public Honda() {
        System.out.println("Honda class constructor");
    }
}
