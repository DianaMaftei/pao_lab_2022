package com.company.repository;

import com.company.config.DatabaseConfiguration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonRepositoryUsingStatements {
    public void createTable() {
        String createTableSql = "CREATE TABLE IF NOT EXISTS person " +
                "(id int PRIMARY KEY AUTO_INCREMENT, " +
                "name varchar(30), " +
                "age int)";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try (Statement stmt = connection.createStatement()) {
            stmt.execute(createTableSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addPerson() {
        String insertPersonSql = "INSERT INTO person(name, age) VALUES('john', 20)";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try (Statement stmt = connection.createStatement()) { //try with resources
            stmt.executeUpdate(insertPersonSql); // returns no of altered lines
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void displayPerson() {
        String selectSql = "SELECT * FROM person";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try (Statement stmt = connection.createStatement()) { //try with resources
            ResultSet resultSet = stmt.executeQuery(selectSql);
            while (resultSet.next()) {
                System.out.println("Id:" + resultSet.getString(1));
                System.out.println("Name:" + resultSet.getString(2));
                System.out.println("Age:" + resultSet.getDouble(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
