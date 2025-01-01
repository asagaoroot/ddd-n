package com.asagaoroot.ddd.chapter;

public class User {

    public final UserId userId;
    public UserName userName;

    public User(UserName name) {
        if(name == null) System.out.println("引数のnameがありません");
        this.userId = new UserId("0"); // dummy
        this.userName = name;
    }
}
