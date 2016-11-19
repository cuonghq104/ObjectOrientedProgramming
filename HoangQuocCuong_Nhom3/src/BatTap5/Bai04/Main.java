/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BatTap5.Bai04;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {

    public static int keyCommand(Scanner scanner) {
        System.out.println("********************************************");
        System.out.println("0. Exit");
        System.out.println("1. Add 1 more employee");
        System.out.println("2. Show employee list");
        System.out.println("3. Add 1 more product");
        System.out.println("4. Show product list");
        System.out.println("5. Add sale product list");
        System.out.print("Enter key command : ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static int keyCommandSaleProduct(Scanner scanner) {
        System.out.println("0. Exit");
        System.out.println("1. Add new sale product");
        System.out.print("Enter key command : ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            int keyCommand = keyCommand(scanner);
            if (keyCommand == 0) {
                break;
            } else {
                switch (keyCommand) {
                    case 1: {
                        Employee employee = new Employee();
                        employee.readFromKeyboard(scanner);
                        Employee.add(employee);
                        break;
                    }
                    case 2: {
                        Employee.printList();
                        break;
                    }
                    case 3: {
                        Product product = new Product();
                        product.readFromKeyboard(scanner);
                        Product.add(product);
                        break;
                    }
                    case 4: {
                        Product.printList();
                        break;
                    }
                    case 5: {
                        for (Employee employee : Employee.getEmployees()) {
                            do {

                                int keyCommandSP = keyCommandSaleProduct(scanner);
                                if (keyCommandSP == 0) {
                                    break;
                                } else {
                                    Product.printMinimizeList();
                                    System.out.print("Enter product id : ");
                                    int id = Integer.parseInt(scanner.nextLine());

                                    Product product = Product.findByID(id);
                                    if (product != null) {
                                        if (!SaleProduct.matchSaleProduct(employee, product)) {
                                            SaleProduct.add(new SaleProduct(employee, product));
                                            System.out.println("Add saler-product successfully");
                                        } else {
                                            System.out.println("This saler-product have been existed");
                                        }
                                    } else {
                                        System.out.println("ID doesn't exist");
                                    }
                                }
                            } while (true);
                        }
                        break;

                    }
                    case 6:
                    {
                        SaleProduct.sortSaleProductListByEPName();
                        System.out.println("Done");
                        break;
                    }
                    case 7:
                    {
                        SaleProduct.sortSaleProductListByProduct();
                        System.out.println("Done");
                        break;
                    }
                    case 8:
                    {
                        SaleProduct.calculateRevenue();
                        break;
                    }
                }
            }
        } while (true);
    }
}
