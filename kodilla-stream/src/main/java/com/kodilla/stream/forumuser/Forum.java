package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(0000, "JSjfjf", 'M', 1984,10,24, 0));
        theForumUserList.add(new ForumUser(0001, "JSfdfsjfjf", 'F', 1964,12,20, 20));
        theForumUserList.add(new ForumUser(0002, "JSjfhhgjf", 'M', 2004,1,2, 10));
        theForumUserList.add(new ForumUser(0003, "JSadasjfjf", 'M', 1999,2,14, 30));
        theForumUserList.add(new ForumUser(0004, "JSjfjghgf", 'F', 1994,5,4, 40));
    }

    public List<ForumUser> getUserList()
    {
        return new ArrayList<>(theForumUserList);
    }
}
