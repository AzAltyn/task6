package task6_1;

import java.util.Arrays;

public class UserBeanImp implements UserBean{
    public Users[] users;
    public UserBeanImp(Users[] users){
        this.users = users;
    }

    @Override
    public void getAllUsers() {
        for (int i=0; i< users.length; i++){
            System.out.println(users[i].toString());
        }
    }
    @Override
    public void getUsersByName(String name) {
        for (Users users1: users){
            if (users1.getName() == name) {
                System.out.println(users1.toString());
            }
        }
    }
    @Override
    public void getUsersBySurname(String surname) {
        for (Users users1: users){
            if (users1.getSurname() == surname) System.out.println(users1.toString());
        }
    }
}
