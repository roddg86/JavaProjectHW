package Seminars.sem3;

public class Main {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");
        //String s3 = new String(new char[]{'h','e','l','l','o'});
        System.out.println(s2 == s1); // false
        System.out.println(s1.equals(s2)); // true
    }
    
}
