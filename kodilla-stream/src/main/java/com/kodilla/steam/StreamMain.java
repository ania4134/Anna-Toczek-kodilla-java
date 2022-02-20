package com.kodilla.steam;

import com.kodilla.steam.beautifier.PoemBeautifier;



public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Przykładowy tekst nr 1", (text) -> "ABC " + text + " ABC");
        poemBeautifier.beautify("Przykładowy tekst nr 2", (text) -> text.toUpperCase());
        poemBeautifier.beautify("PRZYKLADOWY TEKST NR 3", (text) -> text.toLowerCase());
        poemBeautifier.beautify("Przykładowy tekst NR 4", (text) -> "[" + text + "]");

    }
}
