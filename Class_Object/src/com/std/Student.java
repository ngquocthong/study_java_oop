package com.std;

public class Student {
    private String name, email;

    public Student(String n, String e) {
        name = n;
        email = e;
    }

    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }

    public void setEmail(String e) {
        email = e;
    }
    public String getEmail() {
        return email;
    }

}
