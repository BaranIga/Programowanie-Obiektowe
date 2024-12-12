package zad_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Client implements Comparable<Client> {
    String name;
    int clientNumber;
    Date lastLogin;

    public Client(String name, int clientNumber, Date lastLogin) {
        this.name = name;
        this.clientNumber = clientNumber;
        this.lastLogin = lastLogin;
    }

    public String getName() {
        return name;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    @Override
    public String toString() {
        return name + " " + clientNumber + " " + lastLogin;
    }

    @Override
    public int compareTo(Client o) {
        return o.lastLogin.compareTo(this.lastLogin);
    }

    public static void main(String[] args) {
        ArrayList<Client> clients =new ArrayList<>();
        clients.add(new Client("A", 123, new Date(2015, 12, 15)));
        clients.add(new Client("S", 362, new Date(2002, 5, 25)));
        clients.add(new Client("I", 24, new Date(2006, 11, 1)));

        System.out.println(clients);

        Collections.sort(clients);

        System.out.println(clients);
    }
}
