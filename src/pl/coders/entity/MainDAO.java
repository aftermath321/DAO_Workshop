package pl.coders.entity;

public class MainDAO {

    public static void main(String[] args) {
        UserDao user = new UserDao();
        User user1 = new User();

   /*   user1.setUserName("Michal321");
        user1.setEmail("michal@gmail.com");
        user1.setPassword("pass");
        user.create(user1);*//*

        User read = user.read(1);
        System.out.println(read);

        User read2 = user.read(2);
        System.out.println(read2);

        User userUpdate = user.read(1);
        userUpdate.setUserName("newUsername");
        userUpdate.setEmail("newEmail");
        userUpdate.setPassword("newPassword");
        user.update(userUpdate);

        User user3 = new User();
        user3.setUserName("Marcin");
        user3.setEmail("Marcin@gmail.com");
        user3.setPassword("Haselko");
        user.create(user3);
        User[] all = user.showAll();
        for (User u : all){
            System.out.println(u);
        }

        user.delete(1);
        user.delete(2);
*/
    }
}
