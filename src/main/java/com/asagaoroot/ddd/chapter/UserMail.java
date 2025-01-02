package com.asagaoroot.ddd.chapter;

public class UserMail {
    private String value;

    public UserMail(String value) {
        if(value == null) System.out.println("引数がありません");
        if(value.length() < 3) System.out.println("メールは3文字以上です");

        this.value = value;
    }
}
