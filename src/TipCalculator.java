public class TipCalculator {
    private double totalBill;
    private double tipPercentage;
    private int numPeople;

    public TipCalculator(double tb, double tp, int np){
        totalBill = tb;
        tipPercentage = tp;
        numPeople = np;
    }

    public double rounding(double num){
        return Math.round(num*Math.pow(10,2))/Math.pow(10,2);
    }

    public double totalTip(){
        return rounding(totalBill * tipPercentage);
    }

    public double totalTipAndBill(){
        return rounding(totalTip() + totalBill);
    }

    public double tipPerPerson(){
        return rounding(totalTip() / numPeople);
    }

    public double tipAndBillPerPerson(){
        return rounding(totalTipAndBill() / numPeople);
    }
}
