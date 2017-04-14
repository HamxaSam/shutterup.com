package com.example.hamza.shutterup.modals;

/**
 * Created by Hamza on 4/9/2017.
 */

public class Photographer {
    int Image;
    String detail;

    public Photographer(String detail, int image) {
        this.detail = detail;
        Image = image;
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
