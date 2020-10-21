package oop.task1.service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class User {

    int userID;

    int dateOfBirth;

    Map<User, Relations> userRelationsMap = new HashMap<>();

    Map<Relations, User> relationsUserMap = new HashMap<>();

    LinkedList<User> friends = new LinkedList<>();

    LinkedList<Photo> photos = new LinkedList<>();

    LinkedList<Interests> hobby = new LinkedList<>();

    LinkedList<Like> likes = new LinkedList<>();

    public User(int userID, int dateOfBirth, LinkedList<User> friends, LinkedList<Photo> photos,
                LinkedList<Interests> hobby, LinkedList<Like> likes) {
        this.userID = userID;
        this.dateOfBirth = dateOfBirth;
        this.friends = friends;
        this.photos = photos;
        this.hobby = hobby;
        this.likes = likes;
    }

    public Map<User, Relations> getUserRelationsMap() {
        return userRelationsMap;
    }

    public Map<Relations, User> getRelationsUserMap() {
        return relationsUserMap;
    }
}
