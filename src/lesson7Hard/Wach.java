package lesson7Hard;

public class Wach implements Tiked {

    private boolean crash;

    public Wach(boolean crash) {
        this.crash = crash;
    }

    public boolean isCrash() {
        return crash;
    }

    public void setCrash(boolean crash) {
        this.crash = crash;
    }

    public void tikket() throws TikException {
        if (isCrash()) {
            throw new TikException(crash);
        }else {
            System.out.println("Часы не тикают");
        }
    }
}
