package com.asagaoroot.ddd.chapter;

public class UserRepository implements IUserRepository {

    @Override
    public void save(User user) {
        // save dummy
    }

    @Override
    public User find(UserName userName) {
        // find dummy
        return new User(userName);
    }
}
