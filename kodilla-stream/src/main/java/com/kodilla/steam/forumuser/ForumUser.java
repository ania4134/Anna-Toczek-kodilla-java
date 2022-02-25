package com.kodilla.steam.forumuser;

import java.time.LocalDate;


public final class ForumUser {

    final int idNumber;
    final String name;
    final char sex;
    final LocalDate birthDate;
    final int numberOfPosts;


    public ForumUser(final int idNumber,final String name, final char sex, final int yearOfBirth, final int monthOfBirth,final int dayOfBirth,final int numberOfPosts) {
        this.idNumber = idNumber;
        this.name = name;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }


    public int getIdNumber() {
        return idNumber;
    }


    public String getName() {
        return name;
    }


    public char getSex() {
        return sex;
    }


    public LocalDate getBirthDate() {
        return birthDate;
    }


    public int getNumberOfPosts() {
        return numberOfPosts;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;

        ForumUser forumUser = (ForumUser) o;

        if (getIdNumber() != forumUser.getIdNumber()) return false;
        if (getName() != null ? !getName().equals(forumUser.getName()) : forumUser.getName() != null) return false;
        return getBirthDate() != null ? getBirthDate().equals(forumUser.getBirthDate()) : forumUser.getBirthDate() == null;
    }


    @Override
    public int hashCode() {
        int result = getIdNumber();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getBirthDate() != null ? getBirthDate().hashCode() : 0);
        return result;
    }


    public String toString(){
        return " ID number: " + getIdNumber() + ",  nick: " + getName() + ",  date of birth: "
                + getBirthDate() + ",  sex: "+ getSex() + ",  number of posts: " + getNumberOfPosts() + "\n";
    }

}




