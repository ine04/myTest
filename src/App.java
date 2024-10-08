import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        QLNL qlnl = new QLNL();
        Scanner scanner = new Scanner(System.in);

        // Menu  
        while (true) {
            System.out.println("-----------CHON CHUC NANG-----------");
            System.out.println("1. Thêm nhân lực");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị danh sách nhân lực");
            System.out.println("0. Thoát");
            System.out.println("-----------------------------------");

            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Nhập họ tên: ");
                    String hoTen = scanner.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int tuoi = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Nhập giới tính: ");
                    String gioiTinh = scanner.nextLine();
                    System.out.print("Nhập loại nhân lực (1: Công nhân, 2: Nhân viên, 3: Kỹ sư): ");
                    int loaiNhanLuc = scanner.nextInt();
                    scanner.nextLine();  

                    switch (loaiNhanLuc) {
                        case 1:
                            System.out.print("Nhập cấp bậc: ");
                            int capbac = scanner.nextInt();
                            qlnl.addPerson(new CongNhan(hoTen, tuoi, gioiTinh, capbac));
                            break;
                        case 2:
                            System.out.print("Nhập công việc: ");
                            String congviec = scanner.nextLine();
                            qlnl.addPerson(new NhanVien(hoTen, tuoi, gioiTinh, congviec));
                            break;
                        case 3:
                            System.out.print("Nhập chuyên ngành: ");
                            String chuyennganh = scanner.nextLine();
                            qlnl.addPerson(new KySu(hoTen, tuoi, gioiTinh, chuyennganh));
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                    }
                    break;

                case 2:
                    System.out.print("Nhập họ tên cần tìm: ");
                    String searchName = scanner.nextLine();
                    Person foundPerson = qlnl.searchByName(searchName);
                    if (foundPerson != null) {
                        System.out.println("Thông tin tìm thấy: " + foundPerson);
                    } else {
                        System.out.println("Không tìm thấy họ tên: " + searchName);
                    }
                    break;

                case 3:
                    System.out.println("Danh sách nhân lực:");
                    qlnl.displayPersons();
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
