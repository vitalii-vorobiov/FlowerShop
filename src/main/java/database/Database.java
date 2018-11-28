package database;

import flowers.Order;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Database {

    private FileWriter file;
    private ArrayList<Order> orders;
    public boolean my = true;
    public Boolean newMy = Boolean.FALSE;

    public Database(String filename) {

        orders = new ArrayList<Order>();

    }

    public void add(Order Order) {
        // Add Information
        if (file == null) {

        }
        PrintWriter pw = new PrintWriter(file, true);
        pw.println(Order);
    }

    public void commit() throws IOException {
        // Save Information
        file.close();
        file = null;
    }

}
