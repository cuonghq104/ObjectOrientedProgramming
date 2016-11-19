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
public class Product {

    private int id;

    private static int autoID = 1000;

    private String name;

    private double price;

    private int type;

    public Product() {
        id = autoID;
        autoID++;
    }

    public void readFromKeyboard(Scanner scanner) {
        System.out.print("Name      : ");
        name = scanner.nextLine();
        System.out.print("Price ($) : ");
        price = Double.parseDouble(scanner.nextLine());
        System.out.println("Type : 1.Fashion, 2.Electronic, 3.Consumable, 4.Household Appliance");
        System.out.print("Type : ");
        type = Integer.parseInt(scanner.nextLine());
    }

    public void printToScreen() {
//        System.out.println("ID    : " + id);
//        System.out.println("Name  : " + name);
//        System.out.println("Price : " + price);
        String type = "";
        switch (this.type) {
            case 1:
                type = "Fashion";
                break;
            case 2:
                type = "Electronic";
                break;
            case 3:
                type = "Consumable";
                break;
            case 4:
                type = "Household appliance";
                break;
        }
//        System.out.println("Type  : " + type);
        System.out.printf("%6d%15s%6f%20s\n", id, name, price, type);
    }

    public boolean matchID(int id) {
        return (this.id == id) ? true : false;
    }
    
    public boolean matchID(Product product) {
        return (id == product.id) ? true : false;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
    
    public int compareID(Product product) {
        return (product.id < this.id) ? 1 : 0;
    }
}
