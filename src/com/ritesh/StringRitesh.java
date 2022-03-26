package com.ritesh;

import java.util.Locale;

public class StringRitesh {
    public static void main(String[] args) {
        String a = "Ritesh";
        String b = "Patel";

        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(a.concat(" " +b));
        System.out.println(a.toUpperCase(Locale.ROOT));
        System.out.println(b.toLowerCase(Locale.ROOT));
        System.out.println(a.toUpperCase(Locale.ROOT)+" "+b.toLowerCase(Locale.ROOT));
        System.out.println(a.charAt(4));
        System.out.println(a.indexOf('i'));
    }
}
