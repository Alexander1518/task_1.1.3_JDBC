package jm.task.core.jdbc.util;

public interface SQL_QUERY {
    interface USER {
        String CREATE_TABLE = "create table if not exists  Users (Id int AUTO_INCREMENT primary key ,Name varchar(10),LastName varchar(10),Age int)";
        String DROP_TABLE = "drop  table if exists Users ";
        String REMOVE_BY_ID = "delete from Users where Id = ";
        String GET_ALL = "select * from Users";
        String CLEAN_TABLE = "delete from Users";
        String SAVE_USER = "insert Users(Name,LastName,Age) values (?,?,?)";
    }
}