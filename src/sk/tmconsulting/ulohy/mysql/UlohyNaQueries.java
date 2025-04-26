package sk.tmconsulting.ulohy.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UlohyNaQueries {

    private static final String URL = "jdbc:mysql://localhost:3306/sprava_nakladov_2tabulky_db"; // uprav si
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    // 1) Sčítaj celkové náklady v tabuľke expenses
    public double getTotalExpenses() {
        String sql = "SELECT SUM(amount) FROM expenses";

        // Uskutocnenie pripojenia na databazu a vykonanie samotneho query (ktory je ulozeny v premennej sql)
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            // Ak existuje vysledok (cize aspon 1 zaznam) tak pokracuj vo vyberete dat ...
            if (resultSet.next()) {
                return resultSet.getDouble(1); // Cislo 1 reprezentuje poradie stlpca (pola) tabulky podla query, resp. tej casti, ktora nasleduje za SELECT. Mozeme sa odkazovat aj na nazov, napr. return resultSet.getDouble("SUM(amount)") bude tiez akceptovatelne alebo resultSet.getDouble("sum_amount") ak by query vyzeral nasledovne: String sql = "SELECT SUM(amount) AS sum_amount FROM expenses";
            } else {
                return 0.0; // ... ak nie, tak vrati 0.0
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return 0.0;
        }
    }

    // 2) Sčítaj celkové náklady podľa jednotlivých kategórií  v tabuľke expenses
    public Map<String, Double> getExpensesByCategory() {
        String sql = "SELECT category, SUM(amount) FROM expenses GROUP BY category";
        Map<String, Double> categorySums = new HashMap<>();

        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                String category = resultSet.getString(1); // Mozeme nahradit aj resultSet.getString("category");
                double sum = resultSet.getDouble(2); // Mozeme nahradit aj resultSet.getString("SUM(amount)"); alebo aj resultSet.getString("sucet_spolu"); ak by query vyzeral takto: sql = "SELECT category, SUM(amount) AS sucet_spolu FROM expenses GROUP BY category";
                categorySums.put(category, sum);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return categorySums;
    }

    // 10)	Vyhľadaj všetkých členov podľa priezviska začínajúcich na Ž, resp. bezohľadu na diakritiku ak v stĺpci name je meno a priezvisko spolu (sú však oddelené medzerou)
    public List<User> findUsersWithZInName(char character) {
        String sql = "SELECT * FROM users WHERE SUBSTRING_INDEX(name, ' ', -1) LIKE '" + character + "%'";
        List<User> users = new ArrayList<>(); // Dynamicke pole = ArrayList je na zaciatku prazdny, tu sme ho vytvorili

        // Konekcia na databazu a vykonanie query (ktory je ulozeny v premennej sql)
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) { // Prechadzame jednotlivymi zaznamami
                User user = new User(); // Vytvorime prazdneho pouzivatela, ktoreho ...
                user.setId(resultSet.getInt("id")); // ... naplnime id
                user.setName(resultSet.getString("name")); // name
                user.setRelation(resultSet.getString("relation"));
                user.setBirthDate(resultSet.getDate("birth_date"));
                users.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public static void main(String[] args) {
        UlohyNaQueries repository = new UlohyNaQueries();

        double total = repository.getTotalExpenses();
        System.out.println("Total Expenses: " + total);

        Map<String, Double> expensesByCategory = repository.getExpensesByCategory();

        // Print keys and values, STARY ZAPIS
/*        for (String category : expensesByCategory.keySet()) {
            System.out.println("Category: " + category + " Sum: " + expensesByCategory.get(category));
        }*/

        // Print keys and values, NOVY ZAPIS cez lambda výrazy
        expensesByCategory.forEach((category, sum) ->
                System.out.println("Category: " + category + ", Sum: " + sum));


        // Vypise vsetkych pouzivatelov zacinajucich na pismeno Z (ale aj Ž)
        List<User> usersWithZ = repository.findUsersWithZInName('N');
/*        for (User user:usersWithZ) {
            System.out.println(user.getId());
            System.out.println(user.getName());
            System.out.println(user.getRelation());
            System.out.println(user.getBirthDate());
        }*/
        for(User user:usersWithZ)
            System.out.println(user);

    }

}

