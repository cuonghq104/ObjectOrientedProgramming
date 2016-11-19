/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BatTap5.Bai03;

/**
 *
 * @author Cuong
 */
public class ShoppingList {
    private Client client;
    
    private Product product;

    public ShoppingList(Client client, Product product) {
        this.client = client;
        this.product = product;
    }

    public boolean matchIDClient(Client client) {
        return this.client.matchID(client);
    }

    public boolean matIDProduct(Product product) {
        return this.product.matchID(product);
    }
    
    public void printToScreen() {
        System.out.printf("%6d%15s%6d%15s\n", client.getId(), client.getName(), product.getId(), product.getName());
    }
    
    public int compareClientName(ShoppingList shoppingList) {
        return this.client.compareName(shoppingList.client);
    }
    
    public int compareProduct(ShoppingList shoppingList) {
        return this.product.compareID(shoppingList.product);
    }

    public Product getProduct() {
        return product;
    }
    
    
}
