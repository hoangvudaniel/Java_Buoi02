/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java02;

import java.util.Scanner;
import static java02.Java02.n;

/**
 *
 * @author Admin
 */
public class NhanVien {

    private int ma;
    private String ten;

    private NhanVien() {
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    private static NhanVien[] listNhanVien = new NhanVien[n];

    public static NhanVien taoNhanVien() {
        for (int i = 0; i < listNhanVien.length; i++) {
            if (listNhanVien[i] == null) {
                listNhanVien[i] = new NhanVien();
                return listNhanVien[i];
            }
        }
        return null;
    }

    public void nhapNhanVien() {
        System.out.print("Ma : ");
        this.ma = new Scanner(System.in).nextInt();
        System.out.print("Ten : ");
        this.ten = new Scanner(System.in).nextLine();
        System.out.println("");
    }

    public void hienThiNhanVien() {
        System.out.println("Ma : " + this.ma + "| Ten : " + this.ten);
    }
}
