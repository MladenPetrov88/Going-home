import java.util.Scanner;

public class GoingHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = Integer.parseInt(scanner.nextLine());
        double fuelCost = Double.parseDouble(scanner.nextLine());
        double fuelPrice = Double.parseDouble(scanner.nextLine());
        double moneyWin = Double.parseDouble(scanner.nextLine());

        double carFuelCost = (km * fuelCost) / 100;
        double fuelPriceCost = carFuelCost * fuelPrice;

        if (fuelPriceCost <= moneyWin) {
            double leftMoney = moneyWin - fuelPriceCost ;
            System.out.printf("You can go home. %.2f money left.", leftMoney);
        } else {
            double moneyReceive = moneyWin / 5;
            System.out.printf("Sorry, you cannot go home. Each will receive %.2f money.", moneyReceive);
        }
    }
}
