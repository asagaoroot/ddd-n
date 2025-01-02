package com.asagaoroot.ddd.chapter;

public class UserRepository implements IUserRepository {

    @Override
    public User find(UserId userId) {
        // find dummy
        // Connection con = ...
        System.out.println("Find userId: " + userId);
        return new User(new UserName("userName"));
    }

    @Override
    public User find(UserName userName) {
        // find dummy
        // Connection con = ...
        System.out.println("Find userName: " + userName);
        return new User(userName);
    }

    @Override
    public void save(User user) {
        // save dummy
        // Connection con = ...
        System.out.println("Save user: " + user);
    }

    @Override
    public void delete(User user) {
        // delete dummy
        // Connection con = ...
        System.out.println("Delete user: " + user);
    }
}
