public class CreditPaymentService {
    public int calculate(int loanAmount, int years, double annualRate) {
        int months = years * 12; // Срок кредита в месяцах
        double monthlyRate = annualRate / 12 / 100; // Ежемесячная процентная ставка

        // Формула расчета аннуитетного платежа
        double annuityCoefficient = (monthlyRate * Math.pow(1 + monthlyRate, months)) /
                (Math.pow(1 + monthlyRate, months) - 1);
        double monthlyPayment = loanAmount * annuityCoefficient;

        return (int) monthlyPayment; // Возврат целого значения ежемесячного платежа
    }
}
