package com.lib;

import com.std.Student;
import com.time.Time;

import java.util.Scanner;


public class LibraryCard {
    private Student owner;

    public void setOwner(Student o) {
        owner = o;
    }
    public Student getOwner() {
        return owner;
    }

    public void checkOwner(Student s) {
        String ownerName = owner.getName();
        if (s.getName().equals(ownerName)) {
            System.out.printf("%s is owner of this card", s.getName());
        } else {
            System.out.printf("%s is not owner of this card", s.getName());
        }
    }
    public void changeEmailOwner(String oldE, String newE) {
        Time t = new Time();
        t.setTime(13, 45,30);
        String ownerEmail = owner.getEmail();
        if (oldE.equals(ownerEmail)) {
            owner.setEmail(newE);
            System.out.printf("Email changed successfully at %s \n", t);
        } else System.out.println("Email do not match. Try again!");
    }

    public static void main(String[] agrs) {
        Student s1 = new Student("thong", "thong@mail.com");
        Student s2 = new Student("Thong", "the@mail.com");

        LibraryCard l1 = new LibraryCard();
        LibraryCard l2 = new LibraryCard();

        l1.setOwner(s1);
        l2.setOwner(s1);

        l2.checkOwner(s2);

     l1.changeEmailOwner("thong@mail.com", "thongcute@mail.com");
   

//       System.out.println(l1.owner.getEmail());
//       System.out.println(l2.owner.getEmail());



    }
}
