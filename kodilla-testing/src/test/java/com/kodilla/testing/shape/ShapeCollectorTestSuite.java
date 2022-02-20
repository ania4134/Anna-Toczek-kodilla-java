package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class ShapeCollectorTestSuite {


    private static int testCounter =0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }


    @Nested
    @DisplayName("Tests for circle")
    class CircleTest{


        @Test
        void TestAddCircle(){
            // Given
            Circle circle = new Circle("circle", 8.6);
            ShapeCollector shape = new ShapeCollector();

            //When
            shape.addFigure(circle);

            //Then
            assertEquals(1, shape.getFiguresQuantity());
        }


        @Test
        void TestRemoveCircle(){
            //Given
            Circle circle = new Circle("circle", 8.6);
            ShapeCollector shape = new ShapeCollector();
            shape.addFigure(circle);

            //When
            boolean result = shape.removeFigure(circle);

            //Then
            assertTrue(result);
            assertEquals(0, shape.getFiguresQuantity());
        }


        @Test
        void TestRemoveCircleNotExisting(){
            //Given
            Circle circle = new Circle("circle", 8.6);
            ShapeCollector shape = new ShapeCollector();

            //When
            boolean result = shape.removeFigure(circle);

            //Then
            assertFalse(result);
        }


        @Test
        void TestGetCircle(){
            //Given
            Circle circle = new Circle("circle", 8.6);
            ShapeCollector shape = new ShapeCollector();
            shape.addFigure(circle);

            //When
            shape.getFigure(0);
            Circle result = new Circle("circle", 8.6);

            //Then
            assertEquals(result, shape.getFigure(0));
        }


        @Test
        void TestGetCircleNotExisting(){
            //Given
            Circle circle = new Circle("circle", 8.6);
            ShapeCollector shape = new ShapeCollector();

            //When
            shape.getFigure(0);
            String result = null;

            //Then
            assertEquals(result, shape.getFigure(0));
        }


        @Test
        void TestShowCircles(){
            //Given
            Circle circle1 = new Circle("circle1", 8.6);
            Circle circle2 = new Circle("circle2", 6.8);
            Circle circle3 = new Circle("circle3", 10.9);
            ShapeCollector shape = new ShapeCollector();
            shape.addFigure(circle1);
            shape.addFigure(circle2);
            shape.addFigure(circle3);


            //When
            List resultList = new ArrayList();
            resultList.add(circle1);
            resultList.add(circle2);
            resultList.add(circle3);


            //Then
            assertEquals(resultList, shape.showFigures());
        }
    }



    @Nested
    @DisplayName("Tests for square")
    class SquareTest{


        @Test
        void TestAddSquare(){
            // Given
            Square square = new Square("square", 6.0);
            ShapeCollector shape = new ShapeCollector();

            //When
            shape.addFigure(square);

            //Then
            assertEquals(1, shape.getFiguresQuantity());
        }


        @Test
        void TestRemoveSquare(){
            //Given
            Square square = new Square("square", 6.0);
            ShapeCollector shape = new ShapeCollector();
            shape.addFigure(square);

            //When
            boolean result = shape.removeFigure(square);

            //Then
            assertTrue(result);
            assertEquals(0, shape.getFiguresQuantity());
        }


        @Test
        void TestRemoveSquareNotExisting(){
            //Given
            Square square = new Square("square", 6.0);
            ShapeCollector shape = new ShapeCollector();

            //When
            boolean result = shape.removeFigure(square);

            //Then
            assertFalse(result);
        }


        @Test
        void TestGetSquare(){
            //Given
            Square square = new Square("square", 6.0);
            ShapeCollector shape = new ShapeCollector();
            shape.addFigure(square);

            //When
            shape.getFigure(0);
            Square result = new Square("square", 6.0);

            //Then
            assertEquals(result, shape.getFigure(0));
        }


        @Test
        void TestGetSquareNotExisting(){
            //Given
            Square square = new Square("square", 6.0);
            ShapeCollector shape = new ShapeCollector();

            //When
            shape.getFigure(0);
            String result = null;

            //Then
            assertEquals(result, shape.getFigure(0));
        }


        @Test
        void TestShowSquares(){
            //Given
            Circle square1 = new Circle("square1", 6.0);
            Circle square2 = new Circle("square2", 9.0);
            Circle square3 = new Circle("square3", 6.8);
            ShapeCollector shape = new ShapeCollector();
            shape.addFigure(square1);
            shape.addFigure(square2);
            shape.addFigure(square3);


            //When
            List resultList = new ArrayList();
            resultList.add(square1);
            resultList.add(square2);
            resultList.add(square3);


            //Then
            assertEquals(resultList, shape.showFigures());
        }
    }



    @Nested
    @DisplayName("Tests for triangle")
    class TriangleTest{


        @Test
        void TestAddTriangle(){
            // Given
            Triangle triangle = new Triangle("triangle", 6.0, 9.1);
            ShapeCollector shape = new ShapeCollector();

            //When
            shape.addFigure(triangle);

            //Then
            assertEquals(1, shape.getFiguresQuantity());
        }


        @Test
        void TestRemoveTriangle(){
            //Given
            Triangle triangle = new Triangle("triangle", 6.0, 9.1);
            ShapeCollector shape = new ShapeCollector();
            shape.addFigure(triangle);

            //When
            boolean result = shape.removeFigure(triangle);

            //Then
            assertTrue(result);
            assertEquals(0, shape.getFiguresQuantity());
        }


        @Test
        void TestRemoveTriangleNotExisting(){
            //Given
            Triangle triangle = new Triangle("triangle", 6.0, 9.1);
            ShapeCollector shape = new ShapeCollector();

            //When
            boolean result = shape.removeFigure(triangle);

            //Then
            assertFalse(result);
        }


        @Test
        void TestGetTriangle(){
            //Given
            Triangle triangle = new Triangle("triangle", 6.0, 9.1);
            ShapeCollector shape = new ShapeCollector();
            shape.addFigure(triangle);

            //When
            shape.getFigure(0);
            Triangle result = new Triangle("triangle", 6.0, 9.1);

            //Then
            assertEquals(result, shape.getFigure(0));
        }



        @Test
        void TestGetTriangleNotExisting(){
            //Given
            Triangle triangle = new Triangle("triangle", 6.0, 9.1);
            ShapeCollector shape = new ShapeCollector();

            //When
            shape.getFigure(0);
            String result = null;

            //Then
            assertEquals(result, shape.getFigure(0));
        }



        @Test
        void TestShowTriangles(){
            //Given
            Triangle triangle1 = new Triangle("triangle", 6.0, 9.1);
            Triangle triangle2 = new Triangle("triangle2", 6.8, 1.9);
            Triangle triangle3 = new Triangle("triangle3", 10.9, 7.6);
            ShapeCollector shape = new ShapeCollector();
            shape.addFigure(triangle1);
            shape.addFigure(triangle2);
            shape.addFigure(triangle3);


            //When
            List resultList = new ArrayList();
            resultList.add(triangle1);
            resultList.add(triangle2);
            resultList.add(triangle3);


            //Then
            assertEquals(resultList, shape.showFigures());
        }
    }
}
