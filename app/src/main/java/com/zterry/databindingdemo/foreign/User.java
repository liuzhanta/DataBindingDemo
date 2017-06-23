package com.zterry.databindingdemo.foreign;

/**
 * Description:  <br>
 * Author:Terry<br>
 * Date:2017/6/23 下午5:29
 */

public class User {
    public static final String TAG="FOREIGN USER";
    private final String firstName;
    private final String lastName;
    private final String sex;

    public String getSex() {
        return this.sex;
    }

    public User(String firstName, String lastName, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }



    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

}
