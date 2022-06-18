package animal;

public class Fish {
    private String fishName;
    private int  fishSpeed;

    public Fish(String fishName, int fishSpeed) {
        this.fishName = fishName;
        this.fishSpeed = fishSpeed;

    }

    public String getFishName() {
        return fishName;
    }

    public int getFishSpeed() {
        return fishSpeed;
    }

    public void setFishName(String fishName) {
        this.fishName = fishName;
    }

    public void setFishSpeed(int fishSpeed) {
        this.fishSpeed = fishSpeed;
    }
    public String getInfo3(){
        return this.fishName + " " + fishSpeed;
    }
}
