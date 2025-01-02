package com.asagaoroot.ddd.chapter;

public class User {

    public final UserId userId;
    public UserName userName;
    public UserMail userMail;

    // インスタンスを生成する際に利用する。
    public User(UserName name) {
        if(name == null) System.out.println("引数のnameがありません");
        this.userId = new UserId("0"); // dummy
        this.userName = name;
    }

    // インスタンスを再構築する際に利用する。
    public User(UserId id ,UserName name) {
        if(id == null) System.out.println("引数のidがありません");
        if(name == null) System.out.println("引数のnameがありません");
        this.userId = id;
        this.userName = name;
    }

    public void changeName(UserName name) {
        if(name == null) System.out.println("引数のnameがありません");
        this.userName = name;
    }

    public void changeMail(UserMail mail) {
        if(mail == null) System.out.println("引数のnameがありません");
        this.userMail = mail;
    }
}
