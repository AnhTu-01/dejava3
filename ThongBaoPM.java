// ThongBaoPM.java
public class ThongBaoPM implements QuanSat {
    @Override
    public void capNhat(String cachTra, NV nv) {
        if (cachTra.equals("duan")) {
            System.out.println("Thông báo cho đội dự án: Nhân viên " + nv.getHoTen() + " mới được thêm.");
        }
    }
}
