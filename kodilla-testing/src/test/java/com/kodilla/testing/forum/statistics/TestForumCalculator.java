package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.*;

public class TestForumCalculator {

    @Mock
    private Statistics statistics;

    @Test
    void testCalculateAdvStatisticsForZeroPosts()
    {
        //Given
        ForumCalculator forumCalculator = new ForumCalculator(statistics);
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        List<ForumPost> list = new ArrayList<>();
        when(statistics.postsCount()).thenReturn(list.size());

        //When
        int postNumber = forumCalculator.statistics.postsCount();

        //Then
        assertEquals(0,postNumber);
    }

    @Test
    void testCalculateAdvStatisticsForThousandPosts()
    {
        //Given
        ForumCalculator forumCalculator = new ForumCalculator(statistics);
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        List<ForumPost> list = generateListOfPosts(1000);
        when(statistics.postsCount()).thenReturn(list.size());

        //When
        int postNumber = forumCalculator.statistics.postsCount();

        //Then
        assertEquals(1000,postNumber);
    }

    @Test
    void testCalculateAdvStatisticsForZeroComments()
    {
        //Given
        ForumCalculator forumCalculator = new ForumCalculator(statistics);
        List<ForumComment> list = new ArrayList<>();
        when(statistics.commentsCount()).thenReturn(list.size());
        //When
        int commentsNumber = forumCalculator.statistics.commentsCount();
        //Then
        assertEquals(0,commentsNumber);

    }

    @Test
    void testCalculateAdvStatisticsForLargerQuantityOfPostsThanComments()
    {
        //Given

        //When

        //Then

    }

    @Test
    void testCalculateAdvStatisticsForLargerQuantityOfCommentsThanPosts()
    {
        //Given

        //When

        //Then

    }

    @Test
    void testCalculateAdvStatisticsForZeroUsers()
    {
        //Given

        //When

        //Then

    }

    @Test
    void testCalculateAdvStatisticsForHundredUsers()
    {
        //Given

        //When

        //Then

    }

    private List<ForumPost> generateListOfPosts(int numberOfPosts)
    {
        List<ForumPost> postList = new ArrayList<>();
        for(int n = 0; n < numberOfPosts; n++)
        {
            ForumPost thePost = new ForumPost("Hello everyone, " + n, "mrsmith" + n);
            postList.add(thePost);
        }
        return postList;
    }

    private List<ForumUser> generateListOfUsers(int numberOfUsers)
    {
        List<ForumUser> userList = new ArrayList<>();
        for(int n = 0; n < numberOfUsers; n++)
        {
            ForumUser forumUser = new ForumUser("mrsmith" + n, "John Smith" + n);
            userList.add(forumUser);
        }
        return userList;
    }
}
