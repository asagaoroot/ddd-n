package com.asagaoroot.ddd.chapter;

public class UserId {
    private String value;
    public UserId(String value) {
        if(value == null) System.out.println("引数がありません");
        this.value = value;
    }
}
