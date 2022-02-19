package  Feb8HandsOn.Ques3;

public class VehicleMain extends HondaCity {
    public static void main(String[] args) {
        VehicleMain obj = new VehicleMain();

//       Class Inheritance
//       vehicle     --->     Car     --->     Honda     --->     HondaCity     --->     Test
//        engine()            color()           hp()                speed()
//        sound()             model()           features()

        obj.engine();   //vehicle class
        obj.sound();   //vehicle class
        obj.setting();   //vehicle class
        obj.colour();   //Car class
        obj.model();   //Car class
        obj.hp();   //Honda class
        obj.features(); //Honda class
        obj.speed();  // Honda City


    }
    int sum(Object x){
        return 1;
    };
    int sum(int x){
        return 2;
    }

}


