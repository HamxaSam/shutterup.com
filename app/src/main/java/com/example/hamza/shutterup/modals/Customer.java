package com.example.hamza.shutterup.modals;

/**
 * Created by Hamza on 4/9/2017.
 */

public class Customer {
    int Image;
    String detail;

    public Customer(int image, String detail) {
        Image = image;
        this.detail = detail;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
