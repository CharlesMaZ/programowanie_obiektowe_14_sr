import database.DatabaseConnection;
import pl.umcs.oop.lec7.auth.AccountManager;

import pl.umcs.oop.lec7.shop.Cart;
import pl.umcs.oop.lec7.shop.Product;

import java.math.BigDecimal;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.connect();

        AccountManager accountManager = new AccountManager(databaseConnection);
        try {
            var account = accountManager.getUser("test");
            System.out.println(account);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        databaseConnection.disconnect();
    }
}