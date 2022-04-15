package com.nnt.core.b1;

public class Drawable {

    public <T extends IHinhHoc> void draw(T t) {
        System.out.println(t.toString());
    }
}
