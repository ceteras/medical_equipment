package com.company;

/**
 * Created by Timea on 07.05.2017.
 */
public class Product {
    private String name;
    private String category;
    private int productID;
//    private String manufactoringCompany;
//    private int yearOfFabrication;
//    private double price;
//    private boolean discuntedByCNASS;

    public Product() {
        name = "";
        category = "";
        productID = 0;
    }

    public Product(String name, String category, int productID) {
        this.name = name;
        this.category = category;
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getProductID() {
        return productID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void displayInfo() {
        System.out.println("Product name: " + this.name);
        System.out.println("Category: " + this.category);
        System.out.println("ProductID: " + this.productID);
    }
}
