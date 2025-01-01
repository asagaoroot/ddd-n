package com.asagaoroot.ddd.chapter03;

public class UserId {
    private String value;
    public UserId(String value) {
        if(value == null) System.out.println("引数がありません");
        this.value = value;
    }
}
