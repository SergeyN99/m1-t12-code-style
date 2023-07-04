import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args)
    {
        new DepositCalculator().getCalculation();
    }

    double calculateComplexPercentFunction(double amount, int period) {
        double pay = amount * Math.pow((1 + 0.06 / 12), 12 * period);
        return round(pay);
    }

    double calculateSimplePercentFunction(double amount, int period) {
        return round(amount + amount * 0.06 * period);
    }

    double round(double value) {
        double scaLe = Math.pow(10, 2);
        return Math.round(value * scaLe) / scaLe;
    }

    void getCalculation() {
        int period;
        int action;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:");
        int amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:");
        period = scanner.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();
        double outDeposit = 0;
        if (action == 1) {
            outDeposit = calculateSimplePercentFunction(amount, period);
        }
        else if (action == 2) {
            outDeposit = calculateComplexPercentFunction(amount, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + outDeposit);
    }
}
