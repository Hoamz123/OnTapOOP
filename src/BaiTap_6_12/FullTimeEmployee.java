package BaiTap_6_12;

public class FullTimeEmployee extends Employee{

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return 8 * paymentPerHour;
    }

    @Override
    public String toString() {
        return name  + "  " + calculateSalary();
    }
}
