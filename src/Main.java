
public class Main {
    public static void main(String[] args) {
        int amountInRegular = 100;
        int amountInHigh = 1000;
        int amountInSpecial = 10_000;

        int percentInRegular = 1;
        int percentInHigh = 5;
        int percentInSpecial = 30;

        int result = (
                amountInRegular * percentInRegular +
                 amountInHigh * percentInHigh +
                        amountInSpecial * percentInSpecial
                ) / 100;
        int cashback;
        int cashbacklimit = 30
        00;
        if (result > cashbacklimit) {
            cashback = 3_000;
        }  else {
            cashback = 3_000;
        }
        System.out.println(result);

    }
}
