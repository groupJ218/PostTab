import dao.DaoJpaModels;
import dao.DaoModels;
import models.Address;
import models.Product;
import models.User;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        System.out.println(DaoJpaModels.add(new User()).toString()) ;
//        System.out.println(DaoJpaModels.add(new User()).toString()) ;
        User user = new User();
        user = DaoJpaModels.add(new User());
        user.setAddress(DaoJpaModels.add(new Address()));
        user = DaoJpaModels.add(user);
        System.out.println("User result: " + user.toString());
//        ArrayList<Address> addresses = DaoJpaModels.getAll(Address.class);
//        ArrayList<User> users = DaoJpaModels.getAll(User.class);
//        System.out.println(addresses);
//        System.out.println(users);

//        DaoJpaModels.add(new Product());
    }
}
