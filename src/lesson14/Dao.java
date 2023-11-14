package lesson14;

import java.util.ArrayList;
import java.util.List;

interface Dao {
    void addUser(User user);
    User getOneUser();
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class UserDao implements Dao {
    private List<User> storage = new ArrayList<>();

    @Override
    public void addUser(User user) {
        storage.add(user);
    }

    @Override
    public User getOneUser() {
        if (storage.isEmpty()) {
            return null;
        }
        return storage.remove(0);
    }
}

class Main1 {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        userDao.addUser(new User("Користувач 1"));
        userDao.addUser(new User("Користувач 2"));
        userDao.addUser(new User("Користувач 3"));

        List<User> reversedUsers = new ArrayList<>();
        User user;
        while ((user = userDao.getOneUser()) != null) {
            reversedUsers.add(user);
        }

        for (int i = reversedUsers.size() - 1; i >= 0; i--) {
            System.out.println("Користувач: " + reversedUsers.get(i).getName());
        }
    }
}
//