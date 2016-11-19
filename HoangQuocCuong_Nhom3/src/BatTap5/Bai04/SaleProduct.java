/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BatTap5.Bai04;

import java.util.ArrayList;

/**
 *
 * @author Cuong
 */
public class SaleProduct {

    public static void sortSaleProductListByEPName() {
        for (int i = 0; i < saleProducts.size() - 1; i++) {
            for (int j = i + 1; j < saleProducts.size(); j++) {
                if (saleProducts.get(i).employee.compareID(saleProducts.get(j).employee) > 0) {
                    SaleProduct tmp = saleProducts.get(i);
                    saleProducts.set(i, saleProducts.get(j));
                    saleProducts.set(j, tmp);
                }
            }
        }
    }

    public static void sortSaleProductListByProduct() {
        for (int i = 0; i < saleProducts.size() - 1; i++) {
            for (int j = i + 1; j < saleProducts.size(); j++) {
                if (saleProducts.get(i).product.compareID(saleProducts.get(j).product) > 0) {
                    SaleProduct tmp = saleProducts.get(i);
                    saleProducts.set(i, saleProducts.get(j));
                    saleProducts.set(j, tmp);
                }
            }
        }
    }

    public static void calculateRevenue() {
        for (SaleProduct saleProduct : saleProducts) {
            Employee employee = Employee.get(saleProduct.getEmployee());
            employee.addProductRevenue(saleProduct.product.getPrice());
        }
    }
    
    private Employee employee;
    
    private Product product;

    /**************Constructor && getter && setter*******************/
    
    public SaleProduct(Employee employee, Product product) {
        this.employee = employee;
        this.product = product;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    /***************Singleton****************/
    
    private static ArrayList<SaleProduct> saleProducts = new ArrayList<>();
    
    public static void add(SaleProduct saleProduct) {
        saleProducts.add(saleProduct);
    }
    
    // Compare 
    
    public static boolean matchSaleProduct(Employee employee, Product product) {
        for (SaleProduct saleProduct : saleProducts) {
            if (saleProduct.employee.compareID(employee) == 0 &&
                    saleProduct.product.compareID(product) == 0) {
                return true;
            }
        }
        return false;
    }
    
}
