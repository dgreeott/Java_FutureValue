package murach.fv;

/*
Date: November 17th, 2019
@author Drake Greeott
Description: add a Clear button to the GUI version of the Future Value Calculator.
*/

public class Financial {

    public static double calculateFutureValue(double monthlyInvestment,
            double yearlyInterestRate, int years) {

        // convert yearly values to monthly values
        double monthlyInterestRate = yearlyInterestRate / 12 / 100;
        int months = years * 12;        
        
        // calculate the future value
        double futureValue = 0;
        for (int i = 1; i <= months; i++) {
            futureValue += monthlyInvestment;
            double monthlyInterestAmount = futureValue * monthlyInterestRate;
            futureValue += monthlyInterestAmount;            
        }
        
        return futureValue;
    }
}