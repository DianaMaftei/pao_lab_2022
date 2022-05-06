package com.company.repository;

import com.company.config.DatabaseConfiguration;
import com.company.entity.Person;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class PersonRepositoryUsingCallableStatement {

    // run in mysql workbench
    /**
    DELIMITER //
    CREATE PROCEDURE insertPerson(OUT id int, IN name varchar(30), IN age double)
    BEGIN
        INSERT INTO person(name, age) VALUES (name, age);
    SET id = LAST_INSERT_ID();
    END //
    DELIMITER ;

     **/
    public void insertPerson(Person person) {
        String preparedSql = "{call insertPerson(?,?,?)}";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try (CallableStatement cstmt = connection.prepareCall(preparedSql)) {
            cstmt.setString(2, person.getName());
            cstmt.setInt(3, person.getAge());

            cstmt.registerOutParameter(1, Types.INTEGER); // id - result of the procedure call

            cstmt.execute();
            System.out.println("Added user with id:" + cstmt.getInt(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
