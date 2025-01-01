package com.asagaoroot.ddd.chapter;

public class UserApplicationService {
    private final IUserRepository userRepository;
    private final UserService userService;

    public UserApplicationService(IUserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    public void register(String name){
        var user = new User(new UserName(name));
        if(userService.exist(user)){
            System.out.println("User already exists");
        }
        userRepository.save(user);
    }

    public User get(String userId){
        var targetId = new UserId(userId);
        return userRepository.find(targetId);
    }
}
