package com.example.instagramclone.Utils;

/**
 * @author chrisyuhimself@gmail.com
 * @date 18/2/2023 16:22
 */
public class StringManipulation {
    public static String expandUsername(String username) {
        System.out.println(username);
        return username.replace(".", " ");
    }

    public static String condenseUsername(String username) {
        return username.replace(" ", ".");
    }
}
