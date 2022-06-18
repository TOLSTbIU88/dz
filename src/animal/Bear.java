package animal;

public class Bear {
    private String bearName;

    private  int bearSpeed;

    public Bear(String name, int speed) {
        this.bearName = name;
        this.bearSpeed = speed;


    }
    public String getInfo() {
        return this.bearName + " " + this.bearSpeed;
    }


    }

