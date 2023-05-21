package model.purchase;

/**
 * Interface for classes to be observed
 */
public interface RevenueObserver {
    void updateTotalRevenue(double newIncome);
}
