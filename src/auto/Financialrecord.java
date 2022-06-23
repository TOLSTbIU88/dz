package auto;

public class Financialrecord {

    int incomes ;
    int outcomes;

    public Financialrecord(int incomes, int outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public String getInfo (){return this.incomes + "" + this.outcomes;}
}
