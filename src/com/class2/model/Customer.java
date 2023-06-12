package com.class2.model;

import java.util.Scanner;

public class Customer {
    private int id;
    private String maKh;
    private String tenKh;
    private String cmt;
    private String soDt;
    private String email;
    private String ngaySinh;
    private int gioiTinh;
    private String address;
    private int loaiKh;

    public void setId(int id) {
        this.id = id;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public void setSoDt(String soDt) {
        this.soDt = soDt;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLoaiKh(int loaiKh) {
        this.loaiKh = loaiKh;
    }

    public int getId() {
        return id;
    }

    public String getMaKh() {
        return maKh;
    }

    public String getTenKh() {
        return tenKh;
    }

    public String getCmt() {
        return cmt;
    }

    public String getSoDt() {
        return soDt;
    }

    public String getEmail() {
        return email;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public String getAddress() {
        return address;
    }

    public int getLoaiKh() {
        return loaiKh;
    }
    public void InputData() {
        System.out.print("Enter ma Kh: ");
        Scanner input = new Scanner(System.in);
        String maKh= input.nextLine();
        setMaKh(maKh);

        System.out.print("Enter Ten Kh: ");
        String tenKh=input.nextLine();
        setTenKh(tenKh);
        System.out.print("Enter CMT: ");
        String Cmt=input.nextLine();
        setCmt(Cmt);
        System.out.print("Enter SoDt: ");
        String dt=input.nextLine();
        setSoDt(dt);
        System.out.print("Enter Email: ");
        String email=input.nextLine();
        setEmail(email);
        System.out.print("Enter Ngay sinh: ");
        String ngaySinh=input.nextLine();
        setNgaySinh(ngaySinh);
        System.out.print("Enter Address: ");
        String address=input.nextLine();
        setAddress(address);

        System.out.print("Enter loaiKh: ");
        int loaiKh = input.nextInt();
        setLoaiKh(loaiKh);
    }
}
