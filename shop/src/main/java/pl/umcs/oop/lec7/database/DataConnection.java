package pl.umcs.oop.lec7.database;

import java.sql.Connection;

public interface DataConnection {
    Connection getConnection();
    void connect();
    void disconnect();
}
