package com.kodilla.testing.forum.statistics;

public class ForumCalculator {


    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageUserPosts;
    private double averageUserComments;
    private double averagePostComments;
    Statistics statistics;

    public ForumCalculator(Statistics statistics) {
        this.statistics = statistics;
    }

    public  void calculateAdvStatistics(Statistics statistics)
    {

    }

    public void showStatistics()
    {

    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageUserPosts() {
        return averageUserPosts;
    }

    public double getAverageUserComments() {
        return averageUserComments;
    }

    public double getAveragePostComments() {
        return averagePostComments;
    }

    public void setNumberOfUsers(int numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }

    public void setNumberOfPosts(int numberOfPosts) {
        this.numberOfPosts = numberOfPosts;
    }

    public void setNumberOfComments(int numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    public void setAverageUserPosts(double averageUserPosts) {
        this.averageUserPosts = averageUserPosts;
    }

    public void setAverageUserComments(double averageUserComments) {
        this.averageUserComments = averageUserComments;
    }

    public void setAveragePostComments(double averagePostComments) {
        this.averagePostComments = averagePostComments;
    }
}
