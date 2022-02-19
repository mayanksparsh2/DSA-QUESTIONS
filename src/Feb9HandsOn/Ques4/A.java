package  Feb9HandsOn.Ques4;

abstract class A {
    A() {
        System.out.println("this is a constructor of abstract class");
    }

    abstract void aMethod();

    void nonAbstract() {
        System.out.println("This is a normal method of abstract class");
    }
}
