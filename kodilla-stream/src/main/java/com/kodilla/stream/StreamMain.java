package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

import java.util.Locale;

public class StreamMain {
    public static void main(String[] args) {

     PoemBeautifier beautifier = new PoemBeautifier();
       beautifier.beautify("knfnkfdnk", text -> text.toUpperCase());
       beautifier.beautify("FFWWDDSS", text -> text.toLowerCase());
       beautifier.beautify("jddckcdkmkc", text -> "ABC"+text+"ABC");
       beautifier.beautify("dfdjfdjf", text -> text.replace('d','b'));
       beautifier.beautify("jjfjfjjvf", text -> text.repeat(2));
    }
}
