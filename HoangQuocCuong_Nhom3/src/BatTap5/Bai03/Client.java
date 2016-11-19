/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BatTap5.Bai03;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Client {
    private int id;
    
    private String name;
    
    private String address;
    
    private String pn;
    
    private int type;
    
    private static int autoID = 10000;
    
    private int numberOfBoughtProduct;
    
    public double payment;
    
    private static final int MAX_BOUGHT_PRODUCT = 10;
    
    public Client() {
        id = autoID;
        autoID++;
        numberOfBoughtProduct = 0;
        payment = 0;
    }
    
    public void readFromKeyboard(Scanner scanner) {
        System.out.print("Full name : ");
        name = scanner.nextLine();
        System.out.print("Address   : ");
        address = scanner.nextLine();
        System.out.print("Contact   : ");
        pn = scanner.nextLine();
        System.out.println("Type : 1.Wholesale, 0.Retail");
        System.out.print("Type : ");
        type = Integer.parseInt(scanner.nextLine());
    }
    
    public void printToScreen() {
        System.out.println("ID        : " + id);
        System.out.println("Full name : " + name);
        System.out.println("Address   : " + address);
        System.out.println("Contact   : " + pn);
        String type = (this.type == 0) ? "Wholesale" : "Retail";
        System.out.println("Type      : " + type);
    }
    
    public boolean canContinueShopping() {
        return (numberOfBoughtProduct <= MAX_BOUGHT_PRODUCT) ? true : false;
    }
    
    public void increaseNumberOfBoughtProduct() {
        numberOfBoughtProduct++;
    }
    
    public boolean matchID(Client client) {
        return (id == client.id) ? true : false;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public int compareName(Client client) {
        return this.name.compareTo(client.name);
    }
    
    public void addToCart(Product product) {
        payment += product.getPrice();
    }
    
    public void showBill() {
        System.out.printf("%5d%15s   %f", id, name, payment);
    }
}
