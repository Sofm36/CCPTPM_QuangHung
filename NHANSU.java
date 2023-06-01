/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenvanviet_2020603952_81;

import java.util.Scanner;

/**
 *
 * @author IT Supporter
 */
public class NHANSU extends NGUOI {
    private String maNV;
    private String nganhNghe;
    public LUONG luong = new LUONG();

    public NHANSU() {
    }

    public NHANSU(String maNV, String nganhNghe, String hoTen, String ngaySinh, String gioiTinh, String cCCD) {
        super(hoTen, ngaySinh, gioiTinh, cCCD);
        this.maNV = maNV;
        this.nganhNghe = nganhNghe;
    }

    NHANSU(String ht, NHANSU ns, String gt, String cc, String manv, String nn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMaNV() {
        return maNV;
    }

    public String getNganhNghe() {
        return nganhNghe;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setNganhNghe(String nganhNghe) {
        this.nganhNghe = nganhNghe;
    }

    public void nhapLuong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap luong co ban");
        float l = sc.nextFloat();
        luong.setLuongCB(l);
        System.out.println("Nhap he so luong");
        int heso = sc.nextInt();
        luong.setHeSo(heso);
                
    }
}
