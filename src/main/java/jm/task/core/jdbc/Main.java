package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

public class Main {
    public static void main(String[] args)   {

        UserDao userService = new UserDaoHibernateImpl();

        userService.createUsersTable();
        userService.saveUser("Vova", "Smirnov", (byte) 20);
        userService.saveUser("Anna", "Mironova", (byte) 25);
        userService.saveUser("Alex", "Orehov", (byte) 31);
        userService.saveUser("Sasha", "Davidov", (byte) 38);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
