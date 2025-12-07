package on;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinhVien sv = new SinhVien();
        int msv = sc.nextInt();
        sc.nextLine();
        String hoTen = sc.nextLine();
        float diemLt = sc.nextFloat();
        float diemTh = sc.nextFloat();
        sv.setMsv(msv).setHoTen(hoTen).setDiemTH(diemTh).setDiemLT(diemLt).in();
    }
}
