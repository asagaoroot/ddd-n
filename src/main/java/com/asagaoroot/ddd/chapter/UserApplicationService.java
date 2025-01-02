package com.asagaoroot.ddd.chapter;

public class UserApplicationService {

    private final IUserRepository userRepository;
    private final UserService userService;

    public UserApplicationService(IUserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    public UserData get(String userId){
        var targetId = new UserId(userId);
        var user = userRepository.find(targetId);

        if(user == null){return null;}

        return new UserData(user);
    }

    public void register(String name){
        var user = new User(new UserName(name));
        if(userService.exist(user)){
            System.out.println("User already exists");
        }
        userRepository.save(user);
    }

    public void update(String userId, String name, String mail){
        var targetId = new UserId(userId);
        var user = userRepository.find(targetId);
        if(user == null){System.out.println("User does not exist");}

        if(user == null){
            var newUserName = new UserName(name);
            user.changeName(newUserName);
            if(userService.exist(user)){
                System.out.println("User already exists");
            }
        }

        if(mail == null){
            var newUserMail = new UserMail(mail);
            user.changeMail(newUserMail);
        }

        userRepository.save(user);
    }


}
