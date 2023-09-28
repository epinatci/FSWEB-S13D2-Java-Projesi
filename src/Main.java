public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println("***********************************");

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

        System.out.println("***********************************");

        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));

        System.out.println("***********************************");

        System.out.println(getEvenDigitSum(123));
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(-8888));

        System.out.println("***********************************");


    }

    public static boolean isPalindrome(int num) {
        if (num < 0) {
            num = -num; // Negatif sayıyı pozitif yap alternatif num=Math.abs(num);       abs= absolute demek yani mutlak değer
        }

        char[] digits = String.valueOf(num).toCharArray();

        String reversed = "";

        for (int i = digits.length - 1; i >= 0; i--) {
            reversed += digits[i];
        }
        return reversed.equals(String.valueOf(num));

    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }

        int sumOfDivisors = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        return sumOfDivisors == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String[] units = {
                "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
        };

        String words = "";

        while (number > 0) {
            int digit = number % 10;
            words = units[digit] + " " + words;
            number /= 10;
        }

        return words.trim(); // Trim the trailing space and return the result
    }


    //123456789  => 2+4+6+8=20 tüm çift sayıları toplasın sayı negatif olsa dahi
    public static int getEvenDigitSum(int num) {
        num = Math.abs(num);
        int sum = 0;
        char[] digits = String.valueOf(num).toCharArray();

        for (char digit : digits) {
            int parseDigit = Integer.parseInt(String.valueOf(digit));
            if (parseDigit % 2 == 0) {
                sum += parseDigit;
            }
        }
        return sum;
    }
}