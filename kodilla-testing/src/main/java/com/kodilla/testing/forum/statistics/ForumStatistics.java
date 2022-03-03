package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double averagePostsForUser;
    private double averageCommentsForUser;
    private double averageCommentsForPost;

    public void calculateAdvStatistics(Statistics statistics) {
        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();

        if (usersNumber > 0) {
            averagePostsForUser = postsNumber / usersNumber;
        } else {
            averagePostsForUser = 0;
        }

        if (usersNumber > 0) {
            averageCommentsForUser = commentsNumber / usersNumber;
        } else {
            averageCommentsForUser = 0;
        }

        if (statistics.postsCount() > 0) {
            averageCommentsForPost = commentsNumber / postsNumber;
        } else {
            averageCommentsForPost = 0;
        }
    }

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() { return commentsNumber; }

    public double getAveragePostsForUser() {
        return averagePostsForUser;
    }

    public double getAverageCommentsForUser() {
        return averageCommentsForUser;
    }

    public double getAverageCommentsForPost() {
        return averageCommentsForPost;
    }
}
