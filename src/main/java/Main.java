public class Main {
    public static void main(String[] args) {

        System.out.println(switchCase('w'));
        System.out.println(caesarChiffre('w', 3));
        System.out.println(isPrime(3));
        System.out.println(calculateSeries(5));
        System.out.println(calculateSeriesDouble(5));
    }

    public static char switchCase(char c) {

        if (c >= 'A' && c <= 'Z') {

            return (char) (c + 32);  // (casting)

        } else if (c >= 'a' && c <= 'z') {
            return (char) (c - 32);
        } else {
            return 0;
        }
    }

    public static char caesarChiffre(char c, int offset) {

        if (c >= 'A' && c <= 'Z') {
            return (char) (c + offset);
        } else if (c >= 'a' && c <= 'z') {
            return (char) (c + offset);
        } else {
            return c;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i < n; i++) {


            if (n % i == 0) {

                return false;
            }


        }

        return true;
    }

    public static int calculateSeries(int length) {
        int result = 1;
        for (int i = 1; i <= length; i++) {
            result = result * i;
            System.out.println("factorial " + result);
        }
        return result;
    }


    public static double calculateSeriesDouble(int length) {

        double result = 1;
        for (int i = 1; i <= length; i++) {
            result = result * i;
            System.out.println("factorial " + result);
        }

        return result;
    }
}







