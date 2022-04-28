public class Main {
    public static void main(String[] args) {
        int credit = 1_000_000;
        double percent = 9.99;
        int year = 2;
        CreditPaymentService service = new CreditPaymentService();
        double creditPayment = service.calculate(credit, percent, year);
        String result = String.format("%.0f", creditPayment);
        System.out.println("Ежемесячный платеж: " + result + " при сроке кредита " + year + " год(а)");
    }
}
