package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    void testAddTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("task to do nr 1");
        board.getInProgressList().getTasks().add( "task in progress nr 1");
        board.getDoneList().getTasks().add("done task nr 1");

        //Then
        Assertions.assertEquals(1,board.getToDoList().getTasks().size());
        Assertions.assertEquals(1,board.getInProgressList().getTasks().size());
        Assertions.assertEquals(1,board.getDoneList().getTasks().size());
    }
}
