/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hien.baitaplon;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author MoeSubi
 */
public class Customer {
    private static final Scanner S = new Scanner(System.in);
    private String hoten;
    private String gioitinh;
    private Calendar ngaysinh;
    private String quequan;
    private String cccd;
    {
        ngaysinh = new GregorianCalendar();
    }
    public Customer() {

    }
    
    public Customer(String hoten, String gioitinh, String quequan, String cccd) {
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.quequan = quequan;
        this.cccd = cccd;
    }
    
    public void nhapThongTin(){
        System.out.println("Nhap ho va ten: ");
        hoten = S.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioitinh = S.nextLine();
        System.out.println("Nhap que quan: ");
        quequan = S.nextLine();
        System.out.println("Nhap can cuoc cong dan: ");
        cccd = S.nextLine();
    }
    public void hienThi(){
        
        
    }
    
    
    @Override
    public String toString() {
        return null;
    }
}
