package auto;

public class HomeWork {
    public static void main(String[] args) {
        Lada granta = new Lada();
        Toyota corolla = new Toyota();
        granta.startMoving();
        granta.stop();
        granta.crash();
        granta.turnLight();
        corolla.startMoving();
        corolla.stop();
        corolla.turnLight();
        corolla.turnMuzic();

    }
    {
        Financialrecord financialrecord = new Financialrecord(500,300);
        System.out.println(financialrecord);
    }



}
