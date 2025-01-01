package com.asagaoroot.ddd.chapter;

public class Program {

    private IUserRepository userRepository;

    public Program(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    void createUser(String id ,String name) {
        var user = new User(new UserName(name));

        var userService = new UserService(userRepository);
        if(userService.exist(user)){
            System.out.println("User already exists");
        }

        userRepository.save(user);
    }

    void updateUser(String id, String name) {
        var userName = new UserName(name);
    }

}
