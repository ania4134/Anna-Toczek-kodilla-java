package com.kodilla.steam.beautifier;



public class PoemBeautifier {

    public void beautify(String text, PoemDecorator poemDecorator){

        String result = poemDecorator.decorate(text);

        System.out.println(result);
    }

}
