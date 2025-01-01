package com.asagaoroot.ddd.chapter2;

public class UserName {
    private String value;

    public UserName(String value) throws Exception {
        if(value == null) System.out.println("引数がありません");
        if(value.length() < 3) System.out.println("ユーザ名は3文字以上です");

        this.value = value;
    }
}
