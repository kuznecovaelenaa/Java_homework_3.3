public class CreditPaymentService {
    public double calculate(int credit, double percent, int year) {
        double percentCalculation = percent / 100 / 12;
        int month = year * 12;
        double creditPayment = credit * (percentCalculation + percentCalculation / ((Math.pow((1 + percentCalculation), month) - 1)));
        return creditPayment;
    }
}
