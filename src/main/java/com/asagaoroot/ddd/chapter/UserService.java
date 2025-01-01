package com.asagaoroot.ddd.chapter;

public class UserService {
    private IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean exist(User user){
        var found = userRepository.find(user.userName);
        return found != null;
    }
}
