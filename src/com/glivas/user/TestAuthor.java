package com.glivas.user;

public class TestAuthor {
    public static void test (String name, String email, char gender) {
        Author author = new Author(name, email, gender);
        print(author.toString());
    }

    public static void print (String author) {
        System.out.println(author);
    }
}
