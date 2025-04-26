package sk.tmconsulting.ulohy.mysql;

// TODO Uloha c.1: Zobraz vsetky zaznamy z tabulky naklady
// TODO Uloha c.2: Vlozit novy zaznam prostrednictvom konzoly, KONTROLA 20:30

import java.sql.*;

public class CRUDNaklady {

    private static final String URL = "jdbc:mysql://localhost:3306/sprava_nakladov_db";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    // Metóda na pripojenie k databáze
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Create
    public static void vlozNaklad(String nazov, double cena, String kategoria) {
        String query = "INSERT INTO naklady (nazov, cena, kategoria) VALUES (?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nazov);
            stmt.setDouble(2, cena);
            stmt.setString(3, kategoria);
            stmt.executeUpdate();
            System.out.println("Ďalší náklad bol úspešne vytvorený!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Read - Načítanie knihy podľa ID
    public static void zobrazVsetkyNaklady() {
        String query = "SELECT * FROM naklady";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print("\tNázov: " + rs.getString("nazov"));
                System.out.print("\tDátum: " + rs.getTimestamp("datum"));
                System.out.print("\tCena: " + rs.getDouble("cena"));
                System.out.println("\tKategória: " + rs.getString("kategoria"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Read - Načítanie knihy podľa ID
    public static void readBookById(int id) {
        String query = "SELECT * FROM book WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Pages: " + rs.getInt("pages"));
            } else {
                System.out.println("Book not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update - Aktualizácia knihy
    public static void updateBook(int id, String name, int pages) {
        String query = "UPDATE book SET name = ?, pages = ? WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setInt(2, pages);
            stmt.setInt(3, id);
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Book updated successfully!");
            } else {
                System.out.println("Book not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete - Vymazanie knihy
    public static void deleteBook(int id) {
        String query = "DELETE FROM book WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Book deleted successfully!");
            } else {
                System.out.println("Book not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Testovanie CRUD operácií
        vlozNaklad("Bicykel", 199.80, "Iné");
        zobrazVsetkyNaklady();
    }
}

