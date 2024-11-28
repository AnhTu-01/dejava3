// QLNV.java
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class QLNV {
    private static QLNV instance;
    private HashMap<String, NV> dsNV;
    private List<QuanSat> dsQS;

    // Constructor private để ngăn không cho tạo mới ngoài lớp
    private QLNV() {
        dsNV = new HashMap<>();
        dsQS = new ArrayList<>();
    }

    // Phương thức để lấy đối tượng duy nhất của QLNV
    public static QLNV getInstance() {
        if (instance == null) {
            instance = new QLNV();
        }
        return instance;
    }

    // Phương thức thêm observer vào danh sách
    public void themObserver(QuanSat qs) {
        dsQS.add(qs);
    }

    // Phương thức thêm nhân viên mới
    public void themNhanVien(NV nv) {
        dsNV.put(nv.getMaNV(), nv);
        for (QuanSat qs : dsQS) {
            qs.capNhat(nv.getCachTra(), nv);
        }
    }

    // Phương thức tính lương cho nhân viên
    public void tinhLuongChoNV() {
        for (NV nv : dsNV.values()) {
            TinhLuong tinhLuong;
            if (nv.getCachTra().equals("duan")) {
                tinhLuong = new TinhLuongDuAn();
            } else {
                tinhLuong = new TinhLuongNgay();
            }
            double luong = tinhLuong.tinhLuong(nv);
            System.out.println("Lương của nhân viên " + nv.getHoTen() + " là: " + luong);
        }
    }
}
