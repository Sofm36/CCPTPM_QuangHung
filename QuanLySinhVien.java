package baith002;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface TAIKHOAN {
    void nhapTaiKhoan();
    String layTaiKhoan();
    String layMatKhau();
}

class NGUOI {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String CCCD;

    public NGUOI(String hoTen, String ngaySinh, String gioiTinh, String CCCD) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.CCCD = CCCD;
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

    public String getCCCD() {
        return CCCD;
    }
}

class SINHVIEN extends NGUOI implements TAIKHOAN {
    private String maSV;
    private String nganhNghe;
    private String tenTaiKhoan;
    private String matKhau;

    public SINHVIEN(String hoTen, String ngaySinh, String gioiTinh, String CCCD, String maSV, String nganhNghe) {
        super(hoTen, ngaySinh, gioiTinh, CCCD);
        this.maSV = maSV;
        this.nganhNghe = nganhNghe;
    }

    @Override
    public void nhapTaiKhoan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten tai khoan: ");
        tenTaiKhoan = scanner.nextLine();
        System.out.print("Nhap mat khau: ");
        matKhau = scanner.nextLine();
    }

    @Override
    public String layTaiKhoan() {
        return tenTaiKhoan;
    }

    @Override
    public String layMatKhau() {
        return matKhau;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getNganhNghe() {
        return nganhNghe;
    }
}

public class QuanLySinhVien {
    private static List<SINHVIEN> danhSachSinhVien = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            hienThiMenu();
            System.out.print("Nhap lua chon: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng new line

            switch (luaChon) {
                case 1:
                    nhapDanhSachSinhVien();
                    break;
                case 2:
                    hienThiDanhSachSinhVien();
                    break;
                case 3:
                    timKiemSinhVien();
                    break;
                case 4:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }
        } while (luaChon != 4);
    }

    private static void hienThiMenu() {
        System.out.println("CHUONG TRINH QUAN LY SINH VIEN"); System.out.println("--------------------------------------"); System.out.println("1. Nhap danh sach sinh vien"); System.out.println("2. Hien thi"); System.out.println("3. Tim kiem"); System.out.println("4. Thoat"); System.out.println("--------------------------------------"); }
private static void nhapDanhSachSinhVien() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhap so luong sinh vien: ");
    int soLuong = scanner.nextInt();
    scanner.nextLine(); // Đọc bỏ dòng new line

    for (int i = 0; i < soLuong; i++) {
        System.out.println("Nhap thong tin sinh vien " + (i + 1) + ":");
        System.out.print("Ho ten: ");
        String hoTen = scanner.nextLine();
        System.out.print("Ngay sinh: ");
        String ngaySinh = scanner.nextLine();
        System.out.print("Gioi tinh: ");
        String gioiTinh = scanner.nextLine();
        System.out.print("CCCD: ");
        String CCCD = scanner.nextLine();
        System.out.print("Ma sinh vien: ");
        String maSV = scanner.nextLine();
        System.out.print("Nganh nghe: ");
        String nganhNghe = scanner.nextLine();

        SINHVIEN sinhVien = new SINHVIEN(hoTen, ngaySinh, gioiTinh, CCCD, maSV, nganhNghe);
        sinhVien.nhapTaiKhoan();

        danhSachSinhVien.add(sinhVien);
    }

    System.out.println("Da nhap danh sach sinh vien.");
}

private static void hienThiDanhSachSinhVien() {
    if (danhSachSinhVien.isEmpty()) {
        System.out.println("Danh sach sinh vien rong.");
    } else {
        System.out.println("Danh sach sinh vien:");
        for (SINHVIEN sinhVien : danhSachSinhVien) {
            System.out.println("Ho ten: " + sinhVien.getHoTen());
            System.out.println("Ngay sinh: " + sinhVien.getNgaySinh());
            System.out.println("Gioi tinh: " + sinhVien.getGioiTinh());
            System.out.println("CCCD: " + sinhVien.getCCCD());
            System.out.println("Ma sinh vien: " + sinhVien.getMaSV());
            System.out.println("Nganh nghe: " + sinhVien.getNganhNghe());
            System.out.println("Tai khoan: " + sinhVien.layTaiKhoan());
            System.out.println("Mat khau: " + sinhVien.layMatKhau());
            System.out.println("--------------------------------------");
        }
    }
}

private static void timKiemSinhVien() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap ma sinh vien can tim: ");
    String maSV = scanner.nextLine();

    SINHVIEN sinhVienTimKiem = null;
    for (SINHVIEN sinhVien : danhSachSinhVien) {
        if (sinhVien.getMaSV().equals(maSV)) {
            sinhVienTimKiem = sinhVien;
            break;
        }
    }

    if (sinhVienTimKiem != null) {
        System.out.println("Sinh vien co ma sinh vien " + maSV + " tim thay:");
        System.out.println("Ho ten: " + sinhVienTimKiem .getHoTen());
        System.out.println("Ngay sinh: " + sinhVienTimKiem.getNgaySinh());
        
        System.out.println("Gioi tinh: " + sinhVienTimKiem.getGioiTinh());
        System.out.println("CCCD: " + sinhVienTimKiem.getCCCD()); 
        System.out.println("Ma sinh vien: " + sinhVienTimKiem.getMaSV());
        System.out.println("Nganh nghe: " + sinhVienTimKiem.getNganhNghe()); 
        System.out.println("Tai khoan: " + sinhVienTimKiem.layTaiKhoan());
        System.out.println("Mat khau: " + sinhVienTimKiem.layMatKhau()); 
        System.out.println("--------------------------------------"); } 
    else 
    { System.out.println("Khong tim thay sinh vien co ma sinh vien " + maSV); } } }
