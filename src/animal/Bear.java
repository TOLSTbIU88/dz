package animal;

public class Bear {
    String bearName;
    String bear2Name;

    int bearSpeed;
    int bear2Speed;

    public Bear(String name, int speed) {
        this.bearName = name;
        this.bearSpeed = speed;
        this.bear2Name = name;
        this.bear2Speed = speed;


    }
    public String getInfo() {
        return this.bearName + " " + this.bearSpeed;
    }
    public String getInfo2() {
        return this.bear2Name + " " + this.bear2Speed;
    }

    }

