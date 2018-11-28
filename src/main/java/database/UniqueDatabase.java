package database;

public class UniqueDatabase {
    private static UniqueDatabase ourInstance;

    public static UniqueDatabase getInstance() {
        if (ourInstance == null) {
            ourInstance = new UniqueDatabase();
        }

        return ourInstance;
    }

    private UniqueDatabase() {

    }
}
