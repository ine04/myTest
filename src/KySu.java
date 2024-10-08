public class KySu extends Person {
    String chuyennganh;

    public KySu(String HoTen, int Tuoi, String GioiTinh, String chuyennganh){
        super(HoTen, Tuoi, GioiTinh);
        this.chuyennganh = chuyennganh;
    }

    public String getChuyenNganh() {
        return chuyennganh;
    }

    @Override
    public String toString() {
        return super.toString() + ", Chuyên ngành: " + chuyennganh;
    }
    
}
