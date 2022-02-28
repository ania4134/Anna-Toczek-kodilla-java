package com.kodilla.rps;



public class RpsRunner {


    public static void main(String[] args) {
        Instruction instruction = new Instruction();
        instruction.gameInstruction();
        Game game = new Game();
        game.game();
    }
}
