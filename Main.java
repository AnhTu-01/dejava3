// Main.java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo các observer
        ThongBaoHR thongBaoHR = new ThongBaoHR();
        ThongBaoPM thongBaoPM = new ThongBaoPM();

        // Lấy đối tượng duy nhất của QLNV
        QLNV qlnv = QLNV.getInstance();
        
        // Thêm observer vào danh sách
        qlnv.themObserver(thongBaoHR);
        qlnv.themObserver(thongBaoPM);

        // Nhập danh sách nhân viên
        HashMap<String, NV> dsNV = NV.nhapNV();

        // Thêm nhân viên vào hệ thống
        for (NV nv : dsNV.values()) {
            qlnv.themNhanVien(nv);
        }

        // Tính lương cho nhân viên
        qlnv.tinhLuongChoNV();
    }
}
