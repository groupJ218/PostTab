import dao.DaoJpaModels;
import models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //OneToOne
//        Address address = new Address();
//        User user = new User();
//        user.setAddress(address);
//        address.setUser(user);
//        user = DaoJpaModels.add(user);
//        System.out.println(user.toString());

        //ManyToMany
//        PointOfSale pointOfSale = new PointOfSale();
//        pointOfSale.setName("kar");
//        User user = new User();
//        User user1 = new User();
//        List<User> users = new ArrayList<User>();
//        users.add(user);
//        users.add(user1);
//        pointOfSale.setUsers(users);
//        DaoJpaModels.add(pointOfSale);

        //ManyToOne and OneToMany
        Right right = new Right("Delete");
        Right right1 = new Right("Create");
        Right right2 = new Right("Block");

        Role role = new Role();
        role.setRoleName("Admin");

        right.setRole(role);
        right1.setRole(role);
        right2.setRole(role);

        DaoJpaModels.persist(role);
        DaoJpaModels.persist(right);
        DaoJpaModels.persist(right1);
        DaoJpaModels.persist(right2);


    }
}
