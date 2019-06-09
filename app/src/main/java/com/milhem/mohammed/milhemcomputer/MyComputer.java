package com.milhem.mohammed.milhemcomputer;

import android.widget.Button;

import java.nio.file.WatchEvent;

public class MyComputer {
    private String Kind;
    private double Price;
    private double Space;
    private double Ram;
    private long _id;

    public MyComputer() {

    }

    public MyComputer(String Kind, double Price, double Space, double Ram) {
        this.Kind = Kind;
        this.Price = Price;
        this.Space = Space;
        this.Ram = Ram;

    }


    public MyComputer(String Kind, double Price, double Space, double Ram, long _id) {
        this.Kind = Kind;
        this.Price = Price;
        this.Space = Space;
        this.Ram = Ram;
        this._id= _id;

    }

    public String getKind() {
        return Kind;
    }

    public double getPrice() {
        return Price;
    }

    public double getSpace() {
        return Space;
    }

    public double getRam() {
        return Ram;
    }

    public long get_id() {
        return _id;
    }

    public void setKind(String kind) {
        this.Kind = kind;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public void setSpace(double space) {
        this.Space = space;
    }

    public void setRam(double ram) {
        this.Ram = ram;
    }

    public void set_id(long _id){this._id=_id;}

    public String toString() {
        return "Kind:"+this.Kind+"Price:"+this.Price+"Space:"+this.Space+ "Ram:"+this.Ram;
    }
}
