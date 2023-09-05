package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.SessionFactory;


import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        SessionFactory sessionFactory = Util.getSessionFactory();
        UserDao userService = new UserDaoHibernateImpl(sessionFactory);

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
