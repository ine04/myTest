public class CongNhan extends Person {
    int Capbac;

    public CongNhan(String HoTen, int Tuoi, String GioiTinh, int capbac) {
        super(HoTen, Tuoi, GioiTinh);
        this.Capbac = capbac;
    }

   

    public int getCapbac() {
        return Capbac;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cấp bậc: " + Capbac;
    }

}
