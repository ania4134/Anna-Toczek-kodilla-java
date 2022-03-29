package com.kodilla.rps;

import static com.kodilla.rps.Instruction.gameInstruction;

public class RpsRunner {

    public static void main(String[] args) {
        gameInstruction();
        Game game = new Game();
        game.game();
    }
}
