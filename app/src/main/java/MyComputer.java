import android.widget.Button;

import java.nio.file.WatchEvent;

public class MyComputer {
    private String Kind;
    private int Price;
    private int Space;
    private int Ram;
    private long _id;

    public MyComputer() {

    }

    public MyComputer(String Kind, int Price, int Space, int Ram) {
        this.Kind = Kind;
        this.Price = Price;
        this.Space = Space;
        this.Ram = Ram;

    }


    public MyComputer(String Kind, int Price, int Space, int Ram, long _id) {
        this.Kind = Kind;
        this.Price = Price;
        this.Space = Space;
        this.Ram = Ram;
        this._id= _id;

    }

    public String getKind() {
        return Kind;
    }

    public int getPrice() {
        return Price;
    }

    public int getSpace() {
        return Space;
    }

    public int getRam() {
        return Ram;
    }

    public long get_id() {
        return _id;
    }

    public void setKind(String kind) {
        this.Kind = kind;
    }

    public void setPrice(int price) {
        this.Price = price;
    }

    public void setSpace(int space) {
        this.Space = space;
    }

    public void setRam(int ram) {
        this.Ram = ram;
    }

    public void set_id(long _id){this._id=_id;}

    public String toString() {
        return "Kind:"+this.Kind+"Price:"+this.Price+"Space:"+this.Space+ "Ram:"+this.Ram;
    }
}
