import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("What is the total bill: ");
        String totalBill = s.nextLine();
        System.out.print("What is the tip percentage: ");
        String tipPercent = s.nextLine();
        System.out.print("How many people are there: ");
        String numOfPeople = s.nextLine();

        double totalBillD = Double.parseDouble(totalBill);
        double tipPercentD = Double.parseDouble(tipPercent);
        int numOfPeopleD = Integer.parseInt(numOfPeople);
        tipPercentD = tipPercentD/100;

        TipCalculator t = new TipCalculator(totalBillD, tipPercentD, numOfPeopleD);

        System.out.println("\nAs the bill is " + totalBillD + ", and the tip percentage is " + tipPercent + "%:");
        System.out.println("The total tip amount is " + t.totalTip());
        System.out.println("Each person will pay this much in tips: " + t.tipPerPerson());
        System.out.println("The total tip including the bill is " + t.totalTipAndBill());
        System.out.println("And so each person overall will be paying: " + t.tipAndBillPerPerson());
    }
}