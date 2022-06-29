package lesson_7;

public class Duck implements Fligths {

    private boolean isInjured  ;
    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }
    public boolean isInjured() {
        return isInjured;
    }
    public void setInjured(boolean injured) {
        isInjured = injured;
    }
    public void fly()  {
        if (isInjured){
        }
        else

        System.out.println("Утка летит");
    }

}
