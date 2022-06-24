package auto;

public class CarFactory {

    public static Lada NovLada (){
    Lada lada = new Lada();
    return lada;
    }

    public static Toyota NovToyota(){
    Toyota toyota = new Toyota();
    return toyota;
    }



}
