// ThongBaoHR.java
public class ThongBaoHR implements QuanSat {
    @Override
    public void capNhat(String cachTra, NV nv) {
        if (cachTra.equals("ngay")) {
            System.out.println("Thông báo cho phòng nhân sự: Nhân viên " + nv.getHoTen() + " mới được thêm.");
        }
    }
}
