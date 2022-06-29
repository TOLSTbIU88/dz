package lesson_7;

public class HomeWork4 {
    public static void main(String[] args) {


        Plane Tu214 = new Plane(10);
        Plane IL96 = new Plane(-1);
        Duck duckCrak = new Duck(true);
        Duck duckMac = new Duck(false);

        Fligths [] flys = {Tu214,IL96,duckMac,duckCrak};

        for (Fligths fligths: flys)
                fligths.fly();

    }
}
