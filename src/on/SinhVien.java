package on;


public class SinhVien {
    private int msv;
    private String hoTen;
    private float diemLT;
    private float diemTH;


    public SinhVien() {
        msv = 0;
        hoTen = "";
        diemLT = diemTH = 0.0F;
    }

    public SinhVien(int msv, String hoTen, float diemLT, float diemTH) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }


    //tinh diem trung binh
    public float tinhDiemTrungBinh(){
        return (diemLT + diemTH) / 2;
    }

    @Override
    public String toString() {
        return msv + "   " + hoTen + "   " + tinhDiemTrungBinh();
    }

    public int getMsv() {
        return msv;
    }

    public SinhVien setMsv(int msv) {
        this.msv = msv;
        return this;
    }

    public String getHoTen() {
        return hoTen;
    }

    public SinhVien setHoTen(String hoTen) {
        this.hoTen = hoTen;
        return this;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public SinhVien setDiemLT(float diemLT) {
        this.diemLT = diemLT;
        return this;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public SinhVien setDiemTH(float diemTH) {
        this.diemTH = diemTH;
        return this;
    }

    public void in(){
        System.out.println(this);
    }

}
