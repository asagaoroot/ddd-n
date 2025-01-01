package com.asagaoroot.ddd.chapter03;

public class User {

    public final UserId userId;
    public UserName userName;

    public User(UserId id ,UserName name) {
        if(id == null) System.out.println("引数のidがありません");
        if(name == null) System.out.println("引数のnameがありません");
        this.userId = id;
        this.userName = name;
    }
}
