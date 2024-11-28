// TinhLuongNgay.java
public class TinhLuongNgay implements TinhLuong {
    @Override
    public double tinhLuong(NV nv) {
        return nv.getLuongKhoiDiem() / 22;
    }
}
