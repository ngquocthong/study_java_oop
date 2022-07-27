package com.lecture;

public class BicycleRegis {
    public static void main(String[] args) {
        Owner thong = new Owner("Thong", "thong@gmail.com");
        Bicycle bike = new Bicycle();
        bike.setOwner(thong);

        System.out.println(bike.getOwner().getName());
        System.out.println(bike.getOwner().getEmail());
    }
}
