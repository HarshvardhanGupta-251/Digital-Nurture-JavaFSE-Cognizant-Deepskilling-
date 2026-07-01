package Engineering_Concepts.Alog_DS.Financial_Forecasting;

public class FinancialForecast {

    // Recursive function
    static double futureValue(double amount,
                              double growthRate,
                              int years) {

        // Base Case
        if (years == 0) {
            return amount;
        }

        // Recursive Case
        return futureValue(
                amount,
                growthRate,
                years - 1
        ) * (1 + growthRate);
    }

    public static void main(String args[]) {

        double initialAmount = 10000;
        double growthRate = 0.10;
        int years = 5;

        double result =
                futureValue(
                        initialAmount,
                        growthRate,
                        years
                );

        System.out.println(
                "Future Value after "
                + years +
                " years = ₹"
                + result
        );
    }
}
