package task6_1;

public class Main {
    public static void main(String[] args){
        Users[] users = new Users[10];
        users[0] = new Users("John", "Smith");
        users[1] = new Users("John1", "Smith");
        users[2] = new Users("John2", "Smith2");
        users[3] = new Users("John3", "Smith4");
        users[4] = new Users("John", "Smith");
        users[5] = new Users("John4", "Smith4");
        users[6] = new Users("John", "Smith3");
        users[7] = new Users("John7", "Smith2");
        users[8] = new Users("John6", "Smith");
        users[9] = new Users("John", "Smith1");
        UserBeanImp userBeanImp = new UserBeanImp(users);

        System.out.println("List of all users");
        System.out.println("-----------------");
        userBeanImp.getAllUsers();

        System.out.println("Users named \"John\"");
        System.out.println("-----------------");
        userBeanImp.getUsersByName("John");

        System.out.println("A list of people with the surname \"Smith\".");
        System.out.println("-----------------");
        userBeanImp.getUsersBySurname("Smith");
    }
}
