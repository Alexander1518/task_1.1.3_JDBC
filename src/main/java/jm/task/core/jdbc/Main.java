package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        UserDao dao = new UserDaoJDBCImpl();
        UserServiceImpl userService = new UserServiceImpl(dao);
        userService.createUsersTable();
        userService.saveUser("Vasily", "Vasiliev", (byte) 19);
        System.out.println("User с именем – Vasily добавлен в базу данных");
        userService.saveUser("Ivan", "Ivanov", (byte) 25);
        System.out.println("User с именем – Ivan добавлен в базу данных");
        userService.saveUser("Alexander", "Bezrukov", (byte) 34);
        System.out.println("User с именем – Alexander добавлен в базу данных");
        userService.saveUser("Sergey", "Sergeev", (byte) 47);
        System.out.println("User с именем – Sergey добавлен в базу данных");
        System.out.println(" Получение всех User из базы");
        System.out.println(userService.getAllUsers());
        System.out.println("Очистка таблицы User(ов)");
        userService.cleanUsersTable();
        System.out.println("Удаление таблицы");
        userService.dropUsersTable();
    }
}