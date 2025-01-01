package com.asagaoroot.ddd.chapter;

public class UserRepository implements IUserRepository {

    @Override
    public void save(User user) {
        // save dummy
//        Connection con = ...
        System.out.println("Saving user: " + user);
    }

    @Override
    public User find(UserName userName) {
        // find dummy
//        Connection con = ...
        System.out.println("Find userName: " + userName);
        return new User(userName);
    }
}
