package BT_7_12;

public class Order {
    private String id;
    private Pay pay;

    public Order(String id,Pay pay){
        this.id = id;
        this.pay = pay;
    }

    public void Log(){
        System.out.print(id + " ");
        pay.pay();
    }
}
