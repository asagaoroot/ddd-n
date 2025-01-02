package com.asagaoroot.ddd.chapter;

import lombok.Getter;

public class UserData {

    @Getter
    public String id;
    @Getter
    public String name;

    public UserData(User user) {
        this.id = user.userId.toString();
        this.name = user.userName.toString();
    }
}
