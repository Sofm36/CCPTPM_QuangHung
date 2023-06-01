/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenvanviet_2020603952_81;

public class LUONG {
    private float luongCB,luong;
    private int heSo;

    public LUONG() {
    }

    public LUONG(float luongCB, int heSo) {
        this.luongCB = luongCB;
        this.heSo = heSo;
    }

    public float getLuongCB() {
        return luongCB;
    }

    public int getHeSo() {
        return heSo;
    }

    public void setLuongCB(float luongCB) {
        this.luongCB = luongCB;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }
    float tinhluong(float luongCB,int heSo){
        return heSo*luongCB;
    }    
}
