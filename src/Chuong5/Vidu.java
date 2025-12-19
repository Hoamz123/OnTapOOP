package Chuong5;

import java.util.Scanner;

//InvalidAgeException
//custom exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

//TestCustomException
class TestCustomException {

    static void validate(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Tuổi không hợp lệ" + age);
        else
            System.out.println("Chào mừng bạn đã đủ tuổi bầu cử");
    }
}


@FunctionalInterface
interface Method{
    void pay();
}



public class Vidu {
    public static void main(String[] args) {

        Method method = () -> System.out.println("hwa");
        method.pay();

//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        try {
//            TestCustomException.validate(age);
//        } catch (InvalidAgeException e) {
//            System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
//        }
//        System.out.println("Phần còn lại của mã...");
    }
//        Scanner sc = new Scanner(System.in);
//        try (sc) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            float res = (float) a / b;
//            System.out.println(res);
//        } catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
//        System.out.println("Chuong trinh chay xong");
}