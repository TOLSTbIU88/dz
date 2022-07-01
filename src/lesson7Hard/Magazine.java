package lesson7Hard;

public class Magazine {
    public static void main(String[] args) {
    Wach wachmac = new Wach(true);
    Wach wachmac2 = new Wach(false);

    Tiked [] tikeds ={wachmac,wachmac2};
    for (Tiked tiked:tikeds){
        try {
            tiked.tikket();
        }catch (TikException e){
            System.out.println("Часы тикают");
        }

    }

    }
}
