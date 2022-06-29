package lesson_7;

public class HomeWork4 {
    public static void main(String[] args) {


        Plane Tu214 = new Plane(10);
        Plane IL96 = new Plane(-1);
        Duck duck = new Duck(true);
        Duck duck3 = new Duck(false);

        Fligths [] flys = {Tu214,IL96,duck,duck3};
        for (Fligths fligths: flys){
            fligths.fly();
        }
    }
}
