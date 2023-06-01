/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenvanviet_2020603952_81;

/**
 *
 * @author IT Supporter
 */
public class NGUOI {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String cCCD;

    public NGUOI() {
    }

    public NGUOI(String hoTen, String ngaySinh, String gioiTinh, String cCCD) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cCCD = cCCD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getcCCD() {
        return cCCD;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setcCCD(String cCCD) {
        this.cCCD = cCCD;
    }
    
}
