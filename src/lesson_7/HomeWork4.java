package lesson_7;

public class HomeWork4 {
    public static void main(String[] args) {

        Plane plane = new Plane();
        Duck duck = new Duck();

        Fligths [] flys = {plane,duck};
        for (Fligths fligths: flys){
            fligths.fly();
        }
    }
}
