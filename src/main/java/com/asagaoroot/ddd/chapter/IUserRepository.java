package com.asagaoroot.ddd.chapter;

public interface IUserRepository {

        User find(UserId userId);
        User find(UserName username);
        void save(User user);
        void delete(User user);

}
