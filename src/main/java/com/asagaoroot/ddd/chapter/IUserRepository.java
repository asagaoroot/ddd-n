package com.asagaoroot.ddd.chapter;

public interface IUserRepository {

        void save(User user);
        User find(UserName username);

}
