package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Mock
    private Statistics statisticsMock;

    @Test
    void TestCalculateAdvStatisticsPosts0() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(20);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        users.add("user3");
        users.add("user4");
        users.add("user5");
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(5, forumStatistics.getUsersNumber());
        Assertions.assertEquals(0, forumStatistics.getPostsNumber());
        Assertions.assertEquals(20, forumStatistics.getCommentsNumber());
        Assertions.assertEquals(0, forumStatistics.getAveragePostsForUser());
        Assertions.assertEquals(4, forumStatistics.getAverageCommentsForUser());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsForPost());
    }

    @Test
    void TestCalculateAdvStatisticsPosts1000() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        users.add("user3");
        users.add("user4");
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(4, forumStatistics.getUsersNumber());
        Assertions.assertEquals(1000, forumStatistics.getPostsNumber());
        Assertions.assertEquals(2000, forumStatistics.getCommentsNumber());
        Assertions.assertEquals(250, forumStatistics.getAveragePostsForUser());
        Assertions.assertEquals(500, forumStatistics.getAverageCommentsForUser());
        Assertions.assertEquals(2, forumStatistics.getAverageCommentsForPost());
    }

    @Test
    void TestCalculateAdvStatisticsComments0() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(20);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        users.add("user3");
        users.add("user4");
        users.add("user5");
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(5, forumStatistics.getUsersNumber());
        Assertions.assertEquals(20, forumStatistics.getPostsNumber());
        Assertions.assertEquals(0, forumStatistics.getCommentsNumber());
        Assertions.assertEquals(4, forumStatistics.getAveragePostsForUser());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsForUser());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsForPost());
    }

    @Test
    void TestCalculateAdvStatisticsCommentsMoreThanPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(400);
        when(statisticsMock.postsCount()).thenReturn(200);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        users.add("user3");
        users.add("user4");
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(4, forumStatistics.getUsersNumber());
        Assertions.assertEquals(200, forumStatistics.getPostsNumber());
        Assertions.assertEquals(400, forumStatistics.getCommentsNumber());
        Assertions.assertEquals(50, forumStatistics.getAveragePostsForUser());
        Assertions.assertEquals(100, forumStatistics.getAverageCommentsForUser());
        Assertions.assertEquals(2, forumStatistics.getAverageCommentsForPost());
    }

    @Test
    void TestCalculateAdvStatisticsPostsMoreThanComments() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(200);
        when(statisticsMock.postsCount()).thenReturn(400);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        users.add("user3");
        users.add("user4");
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(4, forumStatistics.getUsersNumber());
        Assertions.assertEquals(400, forumStatistics.getPostsNumber());
        Assertions.assertEquals(200, forumStatistics.getCommentsNumber());
        Assertions.assertEquals(100, forumStatistics.getAveragePostsForUser());
        Assertions.assertEquals(50, forumStatistics.getAverageCommentsForUser());
        Assertions.assertEquals(200 / 400, forumStatistics.getAverageCommentsForPost());
    }

    @Test
    void TestCalculateAdvStatisticsUsers0() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(400);
        when(statisticsMock.postsCount()).thenReturn(400);
        List<String> users = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, forumStatistics.getUsersNumber());
        Assertions.assertEquals(400, forumStatistics.getPostsNumber());
        Assertions.assertEquals(400, forumStatistics.getCommentsNumber());
        Assertions.assertEquals(0, forumStatistics.getAveragePostsForUser());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsForUser());
        Assertions.assertEquals(1, forumStatistics.getAverageCommentsForPost());
    }

    public List<String> createUsersList(int numbersOfUsers) {
        List<String> users = new ArrayList<>();
        for (int i = 1; i <= numbersOfUsers; i++) {
            users.add("user" + i);
        }
        return users;
    }

    @Test
    void TestCalculateAdvStatisticsUsers100() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        StatisticsTestSuite statisticsTest = new StatisticsTestSuite();
        when(statisticsMock.commentsCount()).thenReturn(400);
        when(statisticsMock.postsCount()).thenReturn(400);
        List<String> users = statisticsTest.createUsersList(100);
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(100, forumStatistics.getUsersNumber());
        Assertions.assertEquals(400, forumStatistics.getPostsNumber());
        Assertions.assertEquals(400, forumStatistics.getCommentsNumber());
        Assertions.assertEquals(4, forumStatistics.getAveragePostsForUser());
        Assertions.assertEquals(4, forumStatistics.getAverageCommentsForUser());
        Assertions.assertEquals(1, forumStatistics.getAverageCommentsForPost());
    }
}