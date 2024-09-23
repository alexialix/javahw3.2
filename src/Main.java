public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        //Срок кредита - 1 год
        int payment1 = service.calculate(1_000_000, 1, 9.99);
        System.out.println("Ежемесячный платёж (1 год): " + payment1);

        //Срок кредита - 2 года
        int payment2 = service.calculate(1_000_000, 2, 9.99);
        System.out.println("Ежемесячный платёж (2 года): " + payment2);

        //Срок кредита - 3 года
        int payment3 = service.calculate(1_000_000, 3, 9.99);
        System.out.println("Ежемесячный платёж (3 года): " + payment3);
    }
}
