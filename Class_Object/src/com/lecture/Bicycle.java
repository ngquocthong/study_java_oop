package com.lecture;

public class Bicycle {
    private Owner owner; // has a relationship

    public void setOwner(Owner o) {
        owner = o;
    }
    public Owner getOwner() {
        return owner;
    }
}
