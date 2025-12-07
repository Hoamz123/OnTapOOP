package on;

/*
Viết chương trình tính diện tích, chu vi hình chữ nhật.
- Hãy viết lớp HinhChuNhat gồm có:
 Attributes : chiều dài, chiều rộng.
 Phương thức thiết lập (set), và lấy (get) thông tin chiều dài, chiều rộng.
 Phương thức tính diện tích, chu vi.
 Phương thức toString gồm các thông tin dài, rộng, diện tích, chu vi.
- Xây dựng lớp chứa hàm main cho phần kiểm nghiệm. Dài rộng có thể nhập từ bàn phím.
 */

public class HinhChuNhat {

    private int chieuDai;
    private int chieuRong;

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    //tinh dien tihc
    public int tinhDienTich(){
        return chieuDai * chieuRong;
    }

    //tinh chu vi
    public int tinhChuVi(){
        return 2 * (chieuRong + chieuDai);
    }

    @Override
    public String toString() {
        return chieuDai + "   " + chieuRong + "   " + tinhDienTich() + "   " + tinhChuVi();
    }
}

