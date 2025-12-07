package BaiTap_6_12;

public class Main {
    public static void main(String[] args) {
//        IEmployee employee1 = new FullTimeEmployee("hoa",30000);
//        System.out.println(employee1);

        IEmployee employee = new PartTimeEmployee("hoa",20000,4);
        System.out.println(employee);

        System.out.println(employee.calculateSalary());//80000 = 20000 * 4


    }
}
