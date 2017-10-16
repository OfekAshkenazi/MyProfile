package Entities;

/**
 * Created by Android on 10/16/2017.
 */

public class User {
    private String name;
    private int age;
    int imageID;

    public User(String name, int age, int imageID) {
        this.name = name;
        this.age = age;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
