package auto;

public class Financialrecord {

    private int incomes ;
    private int outcomes;

    public Financialrecord(int incomes, int outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public int getIncomes() {
        return incomes;
    }

    public void setIncomes(int incomes) {
        this.incomes = incomes;
    }

    public int getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(int outcomes) {
        this.outcomes = outcomes;
    }

    public String getInfo (){return this.incomes + "" + this.outcomes;}
}
