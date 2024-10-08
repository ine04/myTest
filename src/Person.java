public class Person{
    private String HoTen; 
    private int Tuoi;
    private String GioiTinh;
 
    public Person() {
    }

    public Person(String hoTen, int tuoi, String gioiTinh) {
        HoTen = hoTen;
        Tuoi = tuoi;
        GioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return HoTen;
    }
    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }
    public int getTuoi() {
        return Tuoi;
    }
    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }
    public String isGioiTinh() {
        return GioiTinh;
    }
    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "Ho va ten: " + HoTen + ", Tuoi: " + Tuoi + ", Gioi Tinh: " + GioiTinh;
    }




}