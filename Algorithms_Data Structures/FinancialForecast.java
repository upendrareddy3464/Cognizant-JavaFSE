public class FinancialForecast {
    public static double futureValue(double amount, double rate, int years) {
        if (years == 0) {
            return amount;
        }
        return futureValue(amount * (1 + rate), rate, years - 1);
    }
    public static void main(String[] args) {
        double principal = 10000;
        double growthRate = 0.10; 
        int years = 5;
        double result = futureValue(principal, growthRate, years);
        System.out.println("Future Value = " + result);
    }
}