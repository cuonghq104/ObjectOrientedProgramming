/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BatTap5.Bai04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Product {

    public boolean matchID(int id) {
        if (this.id == id) 
        {
            return true;
        }
        return false;
    }

    private int id;

    private String name;

    private int type;

    private double price;

    private int number;

    private static int autoID = 1000;

    public void readFromKeyboard(Scanner scanner) {
        System.out.print("Name : ");
        name = scanner.nextLine();
        System.out.println("Note : Type (1.Electronic, 2. Electro-Refrigerator, 3.Computer, 4.Office devide)");
        System.out.print("Type : ");
        type = Integer.parseInt(scanner.nextLine());
        System.out.print("Price : ");
        price = Double.parseDouble(scanner.nextLine());
        System.out.print("Number : ");
        number = Integer.parseInt(scanner.nextLine());
        id = autoID;
        autoID++;
    }

    public void printToScreen() {
        String type = "";
        switch (this.type) {
            case 1:
                type = "Electronic";
                break;
            case 2:
                type = "Electro-Refrigerator";
                break;
            case 3:
                type = "Computer";
                break;
            case 4:
                type = "Office devide";
                break;
        }
        System.out.printf("%8d%20s%20s %3f %5d\n", id, name, type, price, number);
    }

    /**
     * *************Singleton******************
     */
    private static ArrayList<Product> products = new ArrayList<>();

    public static void add(Product product) {
        products.add(product);
    }

    public static Product get(int i) {
        return products.get(i);
    }
    
    public static Product getByID(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).id == id)
                return products.get(i);
        }
        return null;
    }
    
    public static void printList() {
        for (Product product : products) {
            product.printToScreen();
        }
    }

    public static void printMinimizeList() {
        for (Product product : products) {
            System.out.printf("%10d%20s %3f\n", product.id, product.name, product.price);
        }
    }

    public static Product findByID(int id) {
        if (id < products.get(0).id || id > autoID) {
            return null;
        }
        for (Product product : products) {
            if (product.matchID(id)) {
                return product;
            }
        }
        return null;
    }
    
    public int compareID(Product product) {
        return ((Integer)this.id).compareTo((Integer)product.id);
    }

    public double getPrice() {
        return price;
    }
    
}
