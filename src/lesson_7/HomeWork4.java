package lesson_7;

public class HomeWork4 {
    public static void main(String[] args) {

        Plane plane = new Plane(10);
        Plane plane1 = new Plane(-1);

        Duck duck = new Duck();
        Duck duck1=new Duck();

        Fligths [] flys = {plane,duck1,plane1,duck};
        for (Fligths fligths: flys){
            fligths.fly();

        }
        
    }
}
