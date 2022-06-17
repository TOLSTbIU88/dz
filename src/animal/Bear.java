package animal;

public class Bear {
    String bearName;
    int bearSpeed;

    Bear(String name, int speed) {
        this.bearName = name;
        this.bearSpeed = speed;

    }
    String getInfo() {
        return this.bearName + " " + this.bearSpeed;
    }

    }

