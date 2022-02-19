package  Feb8HandsOn.Ques4;

public class Main {
    public static void main(String[] args) {
        ChromeBook chromeBook=new ChromeBook(); //extends laptop ->extends Digital
        Ipad ipad=new Ipad(); // extends Digital
        chromeBook.power(); //digital class
        chromeBook.noOfKeys(); //chromebook
        chromeBook.displayQuality(); //laptop class method
        chromeBook.Memory(); //Digital class method
        chromeBook.screenSize(); //laptop class method
        ipad.color();//ipad class
        ipad.power();//digital class
        ipad.Memory();//Digital class
        ipad.model();//ipad class

    }
}
