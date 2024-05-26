package Splitwise.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> userList;

    public UserController(){
        this.userList = new ArrayList<>();
    }

    //Add User
    public void addUser(User user){
        this.userList.add(user);
    }

    //Get User
    public User getUserById(String userId){
        for(User user : this.userList){
            if(user.getUserId().equalsIgnoreCase(userId)){
                return user;
            }
        }
        return null;
    }

    //Get all user
    public List<User> getAllUsers(){
        return userList;
    }
}
