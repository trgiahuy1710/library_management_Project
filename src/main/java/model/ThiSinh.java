package model;

import java.io.Serializable;
import java.util.*;

public class ThiSinh implements Serializable {
    private int maThiSinh;
    private String tenThiSinh;
    private Tinh queQuan;
    private String SĐT;
    private boolean gioiTinh;
    public ThiSinh() {

    }

    public ThiSinh(int maThiSinh, String tenThiSinh, Tinh queQuan, String SĐT, boolean gioiTinh) {
        this.maThiSinh = maThiSinh;
        this.tenThiSinh = tenThiSinh;
        this.queQuan = queQuan;
        this.SĐT = SĐT;
        this.gioiTinh = gioiTinh;

    }
    public int getMaThiSinh() {
        return maThiSinh;
    }

    public void setMaThiSinh(int maThiSinh) {
        this.maThiSinh = maThiSinh;
    }

    public String getTenThiSinh() {
        return tenThiSinh;
    }

    public void setTenThiSinh(String tenThiSinh) {
        this.tenThiSinh = tenThiSinh;
    }

    public Tinh getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(Tinh queQuan) {
        this.queQuan = queQuan;
    }

    public String getSĐT() {
        return SĐT;
    }

    public void setSĐT(String ngaySinh) {
        this.SĐT = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "ThiSinh [maThiSinh=" + maThiSinh + ", tenThiSinh=" + tenThiSinh + ", queQuan=" + queQuan + ", SoDienThoai="
                + SĐT + ", gioiTinh=" + gioiTinh + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ThiSinh other = (ThiSinh) obj;
        return  gioiTinh == other.gioiTinh
                && maThiSinh == other.maThiSinh && Objects.equals(SĐT, other.SĐT)
                && Objects.equals(queQuan, other.queQuan) && Objects.equals(tenThiSinh, other.tenThiSinh);
    }
}
