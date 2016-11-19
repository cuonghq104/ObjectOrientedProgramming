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
public class Employee {
    
    private int id;
    
    private String name;
    
    private String address;
    
    private String phoneNumber;
    
    private String dateBeginToWork;
    
    private static int autoID = 1000;
    
    private double revenue;
    
    public Employee() {
        
    }
    
    public void readFromKeyboard(Scanner scanner) {
        System.out.print("Name :");
        name = scanner.nextLine();
        System.out.print("Address : ");
        address = scanner.nextLine();
        System.out.print("Phone number : ");
        phoneNumber = scanner.nextLine();
        System.out.print("Date begin to work : ");
        dateBeginToWork = scanner.nextLine();
        id = autoID;
        autoID++;
        revenue = 0;
    }
    
    public void addProductRevenue(double price) {
        revenue += price;
    }
    
    public void printToScreen() {
        System.out.printf("%8d%20s%20s%20s%20s", id, name, address, phoneNumber, dateBeginToWork);
        System.out.println("");
    }        
    
    /*****************Singleton*********************/
    
    private static ArrayList<Employee> employees = new ArrayList<>();
    
    public static void add(Employee employee) {
        employees.add(employee);
    } 
    
    public static Employee get(int i) {
        return employees.get(i);
    }
    
    public static Employee get(Employee employee) {
        return get(employee.id - 1000);
    }
    public static void printList() {
        for (Employee employee : employees) {
            employee.printToScreen();
        }
    }

    public static ArrayList<Employee> getEmployees() {
        return employees;
    }
    
    public int compareID(Employee employee) {
        return ((Integer)this.id).compareTo((Integer)employee.id);
    }
}
