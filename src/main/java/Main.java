import dao.DaoJpaModels;
import dao.DaoModels;
import models.Address;
import models.Product;
import models.User;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {

        DaoModels.create(new Address());

//        DaoJpaModels.add(new Product());
    }
}
