package oop.task1;

import oop.task1.service.*;

import java.util.ArrayList;
import java.util.LinkedList;

public class Acquaintance {

    private ArrayList<Interests> allInterests = new ArrayList<>(){{add(Interests.sport); add(Interests.films); add(Interests.music);}};

    private Random rnd = new Random();

    private LinkedList<User> allUsers = new LinkedList<>();

    private void bildUser() {
        User u = new User();
    }

    private LinkedList<Interests> createHobby() {
        LinkedList<Interests> userInterests = new LinkedList<>();
        for (int i = 0; i < allInterests.size(); i++) {
            if (rnd.randomBool()) {
               allInterests.add(allInterests.get(i));
            }
        }
        return userInterests;
    }

    private Gender getGender() {
        if (rnd.randomBool()) {
            return Gender.male;
        } else {
            return Gender.female;
        }
    }

    private LinkedList<Photo> createPhotos() {
        LinkedList<Photo> userPhotos = new LinkedList<>();
        int amountPhotos = rnd.randomInt(1, 10);
        for (int i = 0; i < amountPhotos; i++) {

        }
    }

    private LinkedList<Photo> createFriends() {

    }

    private LinkedList<Like> createLikes() {

    }

    private int createDateOfBirthday() {
        return rnd.randomInt(1920, 2002);
    }





}
