package lesson_7;

public class Duck extends FlyException implements Fligths {

    private String isInjured  ;
    public void fly(){
        System.out.println("Утка летит");
    }

    public Duck() {
        this.isInjured = isInjured;
    }

    @Override
    public void nofly() {
        super.nofly();
    }

    public void setIsInjured(String isInjured) {
        this.isInjured = isInjured;
    }
}
