package com.kodilla.steam;

import com.kodilla.steam.forumuser.Forum;
import com.kodilla.steam.forumuser.ForumUser;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> 2022 - user.getBirthDate().getYear() >= 20)        //nie wiem czy nie jest za bardzo uproszczone, ale nie znalazlam lepszego rozwiązania
                .filter(user -> user.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdNumber, user -> user));

        theResultMapOfUsers.entrySet().stream().
                map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach((System.out::println));
    }
}