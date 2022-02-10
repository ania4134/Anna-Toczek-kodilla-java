package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("Test OK");
        }else{
            System.out.println("Error!");
        }


        Calculator calculator = new Calculator(8,10);

        int resultAdd = calculator.add();
        int resultSubtract = calculator.subtract();

        if(resultAdd == 8+10) {
            System.out.println("Add test ok");
        }else{
            System.out.println("Error!");
        }

        if(resultSubtract == 8-10) {
            System.out.println("Subtract test ok");
        }else{
            System.out.println("Error!");
        }

    }
}
