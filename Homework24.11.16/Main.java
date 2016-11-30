package MyString;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyString string = new MyString("Manchester");
        System.out.println(string.charAt(3));
        System.out.println(new MyString("Hello"));
        string = string.concat(new MyString("United"));
        System.out.println(string);
        System.out.println(string.equals(new MyString("Manch")));
        System.out.println(string.indexOf(new MyString("anch")));
        System.out.println(string.length());
        System.out.println(Arrays.toString(string.split('e')));
        System.out.println(string.substring(0,4));
    }
}
