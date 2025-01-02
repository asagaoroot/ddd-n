package com.asagaoroot.ddd.chapter;

import lombok.Getter;
import lombok.Setter;

public class UserUpdateCommand {

    @Getter
    public String id;
    @Getter
    @Setter
    public String name;
    @Getter
    @Setter
    public String mail;

    public UserUpdateCommand(String id) {
        this.id = id;
    }
}
