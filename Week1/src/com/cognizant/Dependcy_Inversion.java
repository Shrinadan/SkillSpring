package com.cognizant;

interface Database {
    void save(String data);
}

class MySQLDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("MySQL: Data successfully saved -> " + data);
    }
}

class MongoDBDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("MongoDB: Data successfully saved -> " + data);
    }
}

class UserManager {
    private Database database;

    public UserManager(Database database) {
        this.database = database;
    }

    public void registerUser(String username) {
        System.out.println("Registering user: " + username);
        database.save(username);
    }
}

public class Dependcy_Inversion {
    public static void main(String[] args) {
        System.out.println("--- Dependency Inversion Principle Demo --- \n");

        Database mySql = new MySQLDatabase();
        UserManager userManager1 = new UserManager(mySql);
        userManager1.registerUser("Rahul_Cognizant");

        System.out.println();

        Database mongo = new MongoDBDatabase();
        UserManager userManager2 = new UserManager(mongo);
        userManager2.registerUser("Amit_Cognizant");
    }
}
//https://github.com/Shrinadan/cognizant.git