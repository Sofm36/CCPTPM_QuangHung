package nguyenvanviet_2020603952_81;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author IT Supporter
 */
public class Main {

    private static List<NHANSU> dsNS = new ArrayList<>();
    private static void hienThiMenu(){
        System.out.println("CHUONG TRINH QUAN LY NHANSU"); 
        System.out.println("--------------------------------------"); 
        System.out.println("1. Nhap"); 
        System.out.println("2. Hien thi"); 
        System.out.println("3. Sap xep"); 
        System.out.println("4. Thoat"); 
        System.out.println("--------------------------------------");       
    }
    private static void nhapDS(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong nhan su :");
        int num = sc.nextInt();
        sc.nextLine();
        for(int i =0;i<num;i++){
            System.out.println("Nhap thong tin nhan su so" +(i+1));
            System.out.println("Ho ten:");
            String ht = sc.nextLine();
            System.out.println("Ngay sinh:");
            String ngaysinh = sc.nextLine();
            System.out.println("Gioi tinh:");
            String gt = sc.nextLine();
            System.out.println("CCCD:");
            String cc = sc.nextLine();
            System.out.println("Ma nhan vien:");
            String manv = sc.nextLine();
            System.out.println("Nganh nghe:");
            String nn = sc.nextLine();
            NHANSU ns = new NHANSU(ht,ngaysinh,gt,cc,manv,nn);
            ns.nhapLuong();
            dsNS.add(ns);
        }
        System.out.println("Da nhap danh sach nhan su");
    }
    private static void hienthiDS(){
        if(dsNS.isEmpty()){
            System.out.println("Khong co nhan su nao trong danh sach");
        }else{
            System.out.println("------Danh sach nhan su------");
            for (NHANSU ns : dsNS) {
            System.out.println("Ho ten: " + ns.getHoTen());
            System.out.println("Ngay sinh: " + ns.getNgaySinh());
            System.out.println("Gioi tinh: " + ns.getGioiTinh());
            System.out.println("CCCD: " + ns.getcCCD());
            System.out.println("Ma sinh vien: " + ns.getMaNV());
            System.out.println("Nganh nghe: " + ns.getNganhNghe());
            System.out.println("Luong co ban : " + ns.luong.getLuongCB());
            System.out.println("He so luong: " +  ns.luong.getHeSo());
            System.out.println("Tong luong: " +  ns.luong.tinhluong(ns.luong.getLuongCB(),  ns.luong.getHeSo()));            
            System.out.println("--------------------------------------");
        }            
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        do {
            hienThiMenu();
            System.out.println("Nhap lua chon cua ban :");
            temp = sc.nextInt();
            sc.nextLine();
            switch(temp){
                case 1:
                    nhapDS();
                    break;
                case 2:
                    hienthiDS();
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Ket thuc chuong trinh");
                    break;
                default:
                    System.out.println("Vui long nhap lai so");
                    break;
            }
        } while (temp !=4);
    }
//    private static void sapXepNS(){
//        Collections.sort(dsNS,new Comparator<NHANSU>(){
//            @Override public int compare(NHANSU ns1,NHANSU ns2){
//                float l1 = ns1.luong.tinhluong(ns1.luong.getLuongCB(), ns1.luong.getHeSo());
//                float l2 = ns2.luong.tinhluong(ns2.luong.getLuongCB(), ns2.luong.getHeSo());
//                
//                if(l1 > l2){
//                    return -1;
//                }if else(l1>l2){ return 1;
//                }
//                else return 0;
//            }
//                    
//       });
//    }
}   
