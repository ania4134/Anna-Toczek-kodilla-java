package com.kodilla.steam.forumuser;

import java.util.ArrayList;
import java.util.List;


public final class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        ForumUser forumUser1 = new ForumUser(0001, "Mark", 'M', 1998, 5, 25, 10);
        ForumUser forumUser2 = new ForumUser(0002, "Kate", 'F', 2011, 8, 1, 0);
        ForumUser forumUser3 = new ForumUser(0003, "Mia", 'F', 1999, 11, 6, 15);
        ForumUser forumUser4 = new ForumUser(0004, "David", 'M', 2000, 12, 29, 23);
        ForumUser forumUser5 = new ForumUser(0005, "Peter", 'M', 1990, 9, 22, 0);
        ForumUser forumUser6 = new ForumUser(0006, "Anna", 'F', 2005, 5, 5, 9);

        userList.add(forumUser1);
        userList.add(forumUser2);
        userList.add(forumUser3);
        userList.add(forumUser4);
        userList.add(forumUser5);
        userList.add(forumUser6);
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(userList);
    }
}
