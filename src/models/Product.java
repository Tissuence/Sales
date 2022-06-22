package models;


import base.Fiscal;
import base.Income;

public class Product implements Fiscal, Income {

    private String name;
    private int quantity;
    private double price;
    private static final int TAX_RATE = 5;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double calculateIncomeTax(double income) {
        return income * TAX_RATE / 100;
    }

    @Override
    public double calculateIncome(int quantity, double price) {
        return (double) quantity * price;
    }

    @Override
    public double calculatePureIncome(double income, double tax) {
        return income - tax;
    }

}
