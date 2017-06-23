package com.zterry.databindingdemo;

/**
 * Description:  <br>
 * Author:Terry<br>
 * Date:2017/6/23 下午4:43
 */

public class User {
    public static final String DISPLAY_NAME="James";
    private final String firstName;
    private final String lastName;
    private final String sex;

    private final int age;

    public User(String firstName, String lastName, String sex, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public String getSex() {
        return this.sex;
    }





    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
