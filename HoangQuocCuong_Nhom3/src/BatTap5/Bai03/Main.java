/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BatTap5.Bai03;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Cuong
 */
public class Main {

    public static boolean repeatShoppingList(Vector<ShoppingList>shoppingLists, Client client, Product product) {
        for (ShoppingList shoppingList : shoppingLists) {
            if (shoppingList.matIDProduct(product) && shoppingList.matchIDClient(client)) {
                return true;
            }
        }
        return false;
    }
    
    public static int keyCommandShopping(Scanner scanner) {
        System.out.println("Enter");
        System.out.println("0. Exit");
        System.out.println("1. Add new product to shopping list");
        System.out.print("Enter");
        int keyCommandShopping = Integer.parseInt(scanner.nextLine());
        return keyCommandShopping;
    }
    public static int keyCommand(Scanner scanner) {
        System.out.println("Enter : ");
        System.out.println("0. Exit loop");
        System.out.println("1. Add a new client");
        System.out.println("2. Show client list");
        System.out.println("3. Add a new product");
        System.out.println("4. Show product list");
        System.out.println("5. Create shopping list");
        System.out.println("6. Show shopping list");
        System.out.println("7. Sort shopping list by client's name");
        System.out.println("8. Sort shopping list by product");
        System.out.print("Enter : ");
        int key = Integer.parseInt(scanner.nextLine());
        return key;
    }

    public static void main(String[] args) {
        Vector<Client> clients = new Vector<>();
        Vector<Product> products = new Vector<>();
        Vector<ShoppingList>shoppingLists = new Vector<>();
        
        Scanner scanner = new Scanner(System.in);

        int keyCommand = 0;
        do {
            keyCommand = keyCommand(scanner);
            switch (keyCommand) {
                case 1: {
                    Client client = new Client();
                    client.readFromKeyboard(scanner);
                    clients.add(client);
                    break;
                }
                case 2:
                {
                    System.out.println("CLIENTS LIST : ");
                    for (Client client : clients) {
                        client.printToScreen();
                    }
                    break;
                }
                case 3:
                {
                    Product product = new Product();
                    product.readFromKeyboard(scanner);
                    products.add(product);
                    break;
                }
                case 4:
                {
                    System.out.println("PRODUCTS LIST");
                    for (Product product : products) {
                        product.printToScreen();
                    }
                    break;
                }
                case 5:
                {
                    for (Client client : clients) {
                        int keyCommandShopping = 0;
                        do {
                            keyCommandShopping = keyCommandShopping(scanner);
                            if (keyCommandShopping == 1 && client.canContinueShopping()) {
                                System.out.println("PRODUCT LIST : ");
                                for (Product product : products) {
                                    product.printToScreen();
                                }
                                System.out.print("Enter id of product : ");
                                Product shoppingProduct = null;
                                int id = Integer.parseInt(scanner.nextLine());
                                for (Product product : products) {
                                    if (product.matchID(id))
                                        shoppingProduct = product;
                                }
                                if (!repeatShoppingList(shoppingLists, client, shoppingProduct)) {
                                    shoppingLists.add(new ShoppingList(client, shoppingProduct));
                                    client.increaseNumberOfBoughtProduct();
                                } else {
                                    System.out.println("Shopping failed");
                                }
                            }
                        } while(keyCommandShopping != 0);
                    }
                }
                case 6:
                    for (ShoppingList shoppingList : shoppingLists) {
                        shoppingList.printToScreen();
                    }
                case 7:
                {
                    for (int i = 0; i < shoppingLists.size(); i++) {
                        for (int j = i + 1; j < shoppingLists.size(); j++) {
                            if (shoppingLists.get(i).compareClientName(shoppingLists.get(j)) > 0) {
                                ShoppingList tmp = shoppingLists.get(i);
                                shoppingLists.set(i, shoppingLists.get(j));
                                shoppingLists.set(j, tmp);
                            }
                        }
                    }
                }
                break;
                case 8:
                {
                    for (int i = 0; i < shoppingLists.size(); i++) {
                        for (int j = i + 1; j < shoppingLists.size(); j++) {
                            if (shoppingLists.get(i).compareProduct(shoppingLists.get(j)) > 0) {
                                ShoppingList tmp = shoppingLists.get(i);
                                shoppingLists.set(i, shoppingLists.get(j));
                                shoppingLists.set(j, tmp);
                            }
                        }
                    }
                }
                break;
                case 9:
                {
                    for (ShoppingList shoppingList : shoppingLists) {
                        for (Client client : clients) {
                            if (shoppingList.matchIDClient(client)) {
                                client.addToCart(shoppingList.getProduct());
                            }
                        }
                    }
                    for (Client client : clients) {
                        client.showBill();
                    }
                }
                break;
                    
            }
        } while (keyCommand != 0);
    }
}
