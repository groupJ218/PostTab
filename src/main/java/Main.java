import dao.DaoJpaModels;
import models.Address;
import models.User;

public class Main {
    public static void main(String[] args) {

//        System.out.println(DaoJpaModels.add(new User()).toString()) ;
//        System.out.println(DaoJpaModels.add(new User()).toString()) ;

        User user = DaoJpaModels.getById(50, User.class);
        Address address = new Address();
        address.setCity("frefef2");

        user.setAddress(address);
        address.setUser(user);
        user = DaoJpaModels.add(user);

        System.out.println(user.toString());

//        DaoJpaModels.add(address);


//        System.out.println("User result: " + user.toString());
//        ArrayList<Address> addresses = DaoJpaModels.getAll(Address.class);
//        ArrayList<User> users = DaoJpaModels.getAll(User.class);
//        System.out.println(addresses);
//        System.out.println(users);

//        DaoJpaModels.add(new Product());
    }
}
