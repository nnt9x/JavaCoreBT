package com.nnt.collection;

public class Nguoi {
    // default
    int id;
    String hoTen;
    int age;

    public Nguoi(int id, String hoTen, int age) {
        this.id = id;
        this.hoTen = hoTen;
        this.age = age;
    }

    public Nguoi() {

    }

    @Override
    public String toString() {
        return "Nguoi[" +
                "id=" + id +
                ", hoTen='" + hoTen + '\'' +
                ", age=" + age +
                ']';
    }
}
