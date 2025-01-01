package com.asagaoroot.ddd.chapter03;

public class Program {

    void createUser(String id ,String name) {
        var userId = new UserId(id);
        var userName = new UserName(name);
        var user = new User(userId, userName);
    }

    void updateUser(String id, String name) {
        var userName = new UserName(name);
    }

}
