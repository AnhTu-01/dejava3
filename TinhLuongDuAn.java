// TinhLuongDuAn.java
public class TinhLuongDuAn implements TinhLuong {
    @Override
    public double tinhLuong(NV nv) {
        return nv.getLuongKhoiDiem() * 1.5;
    }
}
