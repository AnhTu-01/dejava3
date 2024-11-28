// NV.java
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class NV {
    private String maNV;
    private String hoTen;
    private LocalDate ngayVaoLam;
    private double luongKhoiDiem;
    private String cachTra;

    // Constructor
    public NV(String maNV, String hoTen, LocalDate ngayVaoLam, double luongKhoiDiem, String cachTra) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.ngayVaoLam = ngayVaoLam;
        this.luongKhoiDiem = luongKhoiDiem;
        this.cachTra = cachTra;
    }

    // Getters
    public String getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public LocalDate getNgayVaoLam() {
        return ngayVaoLam;
    }

    public double getLuongKhoiDiem() {
        return luongKhoiDiem;
    }

    public String getCachTra() {
        return cachTra;
    }

    // Hàm static để nhập dữ liệu vào từ bàn phím
    public static HashMap<String, NV> nhapNV() {
        HashMap<String, NV> dsNV = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Nhập mã nhân viên (hoặc # để kết thúc): ");
            String maNV = scanner.nextLine();
            if (maNV.equals("#")) {
                break;
            }
            
            try {
                System.out.print("Nhập họ tên: ");
                String hoTen = scanner.nextLine();
                System.out.print("Nhập ngày vào làm (yyyy-MM-dd): ");
                LocalDate ngayVaoLam = LocalDate.parse(scanner.nextLine());
                System.out.print("Nhập lương khởi điểm: ");
                double luongKhoiDiem = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập cách trả lương (duan/ngay): ");
                String cachTra = scanner.nextLine();
                
                if (!cachTra.equals("duan") && !cachTra.equals("ngay")) {
                    System.out.println("Cách trả lương không hợp lệ!");
                    continue;
                }
                
                NV nv = new NV(maNV, hoTen, ngayVaoLam, luongKhoiDiem, cachTra);
                dsNV.put(maNV, nv);
            } catch (Exception e) {
                System.out.println("Lỗi nhập dữ liệu: " + e.getMessage());
            }
        }
        return dsNV;
    }
}
