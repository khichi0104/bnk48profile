package com.suki.bnk48profile.adapter;

/**
 * Created by KUK on 4/3/2560.
 */

public class ProfileItem {

    String nickname;
    String name;
    String surname;
    String image;
    String birthdate;
    int height;
    String bloodtype;
    String birthplace;
    String like;
    String hobby;

    public ProfileItem(String nickname, String name, String sur, String imageP, String birth, int h, String blood, String bplace, String fav, String hobbies)
    {
        setNickname(nickname);
        setName(name);
        setSurname(sur);
        setImage(imageP);
        birthdate = birth;
        height = h;
        bloodtype = blood;
        birthplace = bplace;
        like = fav;
        hobby = hobbies;

    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }





    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
