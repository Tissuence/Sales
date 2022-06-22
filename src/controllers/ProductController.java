package controllers;

import models.Product;
import utils.Rounder;
import views.SalesView;

public class ProductController {

    Product model;
    SalesView view;

    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        String name = this.model.getName();
        double income = this.model.calculateIncome(this.model.getQuantity(), this.model.getPrice());
        String roundedIncome = Rounder.roundValue(income);
        double tax = this.model.calculateIncomeTax(income);
        String roundedTax = Rounder.roundValue(tax);
        double pureIncome = this.model.calculatePureIncome(income, tax);
        String roundedPureIncome = Rounder.roundValue(pureIncome);

        String output = "Назва товару: " + name + "\n" + "Загальний дохід - " + roundedIncome +
                " грн, із якого  " + roundedPureIncome + " грн - чистий дохід, a " + roundedTax + " грн - податок на дохід.";

        view.getOutput(output);
    }
}
