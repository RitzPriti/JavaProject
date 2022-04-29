package com;

import java.util.ArrayList;
import java.util.Collections;

public class Lecture11ArrayList {

    public static void main(String[] args) {

        ArrayList<String> studentName = new ArrayList<>();
        studentName.add("Falguni");
        studentName.add("Yash");
        studentName.add("Amisha");

        Collections.sort(studentName);
        System.out.println(studentName);

    }
}
