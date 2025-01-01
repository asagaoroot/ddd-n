package com.asagaoroot.ddd.chapter2;

public class Program {

    void CreateUser(String name) throws Exception {
        var userName = new UserName(name);
        var user = new User(userName);
    }

    void UpdateUser(String id, String name) throws Exception {
        var userName = new UserName(name);
    }

}
