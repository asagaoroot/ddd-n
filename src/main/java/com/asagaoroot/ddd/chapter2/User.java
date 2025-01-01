package com.asagaoroot.ddd.chapter2;

public class User {

    public UserName userName;

    public User(UserName name) {
        if(name == null) System.out.println("引数がありません");
        userName = name;
    }
}
