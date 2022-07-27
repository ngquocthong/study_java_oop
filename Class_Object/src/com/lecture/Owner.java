package com.lecture;

public class Owner {
    private String name, email; //instance variable, data class,

    public Owner(String n1, String e1) {
        name = n1;
        email = e1;
    }

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String e) {
        email = e;
    }


}
