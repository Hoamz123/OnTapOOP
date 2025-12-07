package BT_7_12;

public class Main {
    public static void main(String[] args) {
//        Order orderBike = new Order("CT08",new Bike());
//        orderBike.Log();

        //or

        Order order = new Order("Hoa",() ->{
            //ex
            System.out.println("Implement");
        });
        order.Log();
    }
}
