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
    private String username;
    private String pw;
    private double tienTK;

    public Account() {

    }
    
    public Account(String username, String pw, double tienTK) {
        this.username = username;
        this.pw = pw;
        this.tienTK = tienTK;
    }

    
    
    public void nhap() {
        
    }
    
    
    public void hienThi(){
        System.out.printf("So tai khoan cua quy khach la: %1f VND\n", tienTK);
    }
    
    public void napTien(){

    }
    public void rutTien(){
        
    }
    public double laiXuat(){
        return (this.tienTK * 0.002 / 12 * 12); //lai ky han 0.2%
    }
    @Override
    public String toString() {
        return null;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the pw
     */
    public String getPw() {
        return pw;
    }

    /**
     * @param pw the pw to set
     */
    public void setPw(String pw) {
        this.pw = pw;
    }

    /**
     * @return the tienTK
     */
    public double getTienTK() {
        return tienTK;
    }

    /**
     * @param tienTK the tienTK to set
     */
    public void setTienTK(double tienTK) {
        this.tienTK = tienTK;
    }
}
    


