public class NhanVien extends Person {
    private String congviec;

    public NhanVien(String hoTen, int tuoi, String gioiTinh, String congviec) {
        super(hoTen, tuoi, gioiTinh);
        this.congviec = congviec;
    }

    public String getCongViec() {
        return congviec;
    }

    @Override
    public String toString() {
        return super.toString() + ", Công việc: " + congviec;
    }
}
