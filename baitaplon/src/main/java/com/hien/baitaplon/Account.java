/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hien.baitaplon;

/**
 *
 * @author MoeSubi
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Account {

    private static final Scanner S = new Scanner(System.in);
    private String hoten;
    private String gioitinh;
    private Date ngaysinh;
    private String quequan;
    private int cccd;
    private double tien;

    public Account() {

    }

    public Account(String hoten, String gioitinh, Date ngaysinh, String quequan, int cccd, double tien) {
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
        this.cccd = cccd;
        this.tien = tien;
    }

    public void nhap() {
        System.out.println("Nhap ho va ten: ");
        this.setHoten(S.nextLine());

    }
    public void hienThi(){
        
    }
    @Override
    public String toString() {
        return null;
    }
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }


    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }


    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public int getCccd() {
        return cccd;
    }

    public void setCccd(int cccd) {
        this.cccd = cccd;
    }
    
    public double getTien() {
        return tien;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }
}
