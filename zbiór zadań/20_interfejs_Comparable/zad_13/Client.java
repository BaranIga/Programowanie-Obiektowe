package zad_13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Client implements Comparable<Client> {
    String name;
    double balance;
    LocalDate lastPurchaseDate;

    public Client(String name, double balance, LocalDate lastPurchaseDate) {
        this.name = name;
        this.balance = balance;
        this.lastPurchaseDate = lastPurchaseDate;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDate getLastPurchaseDate() {
        return lastPurchaseDate;
    }

    @Override
    public String toString() {
        return name + " " + balance + " " + lastPurchaseDate;
    }

    @Override
    public int compareTo(Client o) {
        if (this.balance != o.balance) {
            return Double.compare(o.balance, this.balance);
        }
        return lastPurchaseDate.compareTo(o.lastPurchaseDate);
    }

    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<>();
        clients.add(new Client("Abc", 2000.50, LocalDate.of(2004, 10, 25)));
        clients.add(new Client("Bac", 250, LocalDate.of(2014, 10, 31)));
        clients.add(new Client("Ofe", 850.10, LocalDate.of(2024, 11, 25)));
        clients.add(new Client("Ewb", 20500, LocalDate.of(2004, 10, 25)));

        System.out.println(clients);
        Collections.sort(clients);
        System.out.println(clients);
    }
}
