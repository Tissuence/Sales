package base;

public interface Income {

    double calculateIncome(int quantity, double price);

    double calculatePureIncome(double income, double tax);
}
