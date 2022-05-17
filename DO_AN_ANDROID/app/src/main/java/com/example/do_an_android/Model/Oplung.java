package com.example.do_an_android.Model;

import java.io.Serializable;

public class Oplung implements Serializable {
    public int idproduct;
    public String nameproduct;
    public int price;
    public String loaisp;
    public String hinh;
    public String bnt;
    public int sum;

    public int getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    public String getNameproduct() {
        return nameproduct;
    }

    public void setNameproduct(String nameproduct) {
        this.nameproduct = nameproduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLoaisp() {
        return loaisp;
    }

    public void setLoaisp(String loaisp) {
        this.loaisp = loaisp;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public String getBnt() {
        return bnt;
    }

    public void setBnt(String bnt) {
        this.bnt = bnt;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public Oplung(int idproduct, String nameproduct, int price, String loaisp, String hinh) {
        this.idproduct = idproduct;
        this.nameproduct = nameproduct;
        this.price = price;
        this.loaisp = loaisp;
        this.hinh=hinh;
        this.bnt= bnt;
        this.sum= sum;
    }
}
