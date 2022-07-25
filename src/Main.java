import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello cac ban");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số các bạn cần dịch ");
        short number = scanner.nextShort();

        if (0 <= number && number < 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nice");
                    break;

            }

        }
        if (10 <= number && number < 20) {
            if (number <= 12) {
                switch (number) {
                    case 10:
                        System.out.println("ten");
                        break;
                    case 11:
                        System.out.println("eleven");
                        break;
                    case 12:
                        System.out.println("twelve");
                }
            } else {
                String donVi = "";
                switch (number % 10) {
                    case 3:
                        donVi = "third";
                        break;
                    case 4:
                        donVi = "four";
                        break;
                    case 5:
                        donVi = "five";
                        break;
                    case 6:
                        donVi = "six";
                        break;
                    case 7:
                        donVi = "seven";
                        break;
                    case 8:
                        donVi = "eight";
                        break;
                    case 9:
                        donVi = "nice";
                        break;
                }

                System.out.println(donVi + " teen ");
            }
        }
        if (number >= 20 && number < 100) {
            String chuc = "";
            String donVi2 = "";
            switch (number / 10) {
                case 2:
                    chuc = "twenty";
                    break;
                case 3:
                    chuc = "thirty";
                    break;
                case 4:
                    chuc = "forty";
                    break;
                case 5:
                    chuc = "fifty";
                    break;
                case 6:
                    chuc = "sixty";
                    break;
                case 7:
                    chuc = "seventy";
                    break;
                case 8:
                    chuc = "eighty";
                    break;
                case 9:
                    chuc = "ninety";
                    break;

            }
            switch (number % 10) {
                case 1:
                    donVi2 = "one";
                    break;
                case 2:
                    donVi2 = "two";
                    break;
                case 3:
                    donVi2 = "three";
                    break;
                case 4:
                    donVi2 = "four";
                    break;
                case 5:
                    donVi2 = "five";
                    break;
                case 6:
                    donVi2 = "six";
                    break;
                case 7:
                    donVi2 = "seven";
                    break;
                case 8:
                    donVi2 = "eight";
                    break;
                case 9:
                    donVi2 = "nice";
                    break;
            }
            System.out.printf(chuc + donVi2);

        }
        if (number > 100 && number < 1000) {
            String tram3 = "";

            switch (number / 100) {
                case 1:
                    tram3 = "one hundred";
                    break;
                case 2:
                    tram3 = "two hundred";
                    break;
                case 3:
                    tram3 = "three hundred";
                    break;
                case 4:
                    tram3 = "four hundred";
                    break;
                case 5:
                    tram3 = "five hundred";
                    break;
                case 6:
                    tram3 = "six hundred";
                    break;
                case 7:
                    tram3 = "seven hundred";
                    break;
                case 8:
                    tram3 = "eight hundred";
                    break;
                case 9:
                    tram3 = "nine hundred";
                    break;
            }
            int number2 = number % 100;
            String chuc3 = "";
            String donVi3 = "";

            if (number2 / 10 == 1) {
                switch (number2 % 10) {
                    case 0:
                        chuc3 = "ten";
                        break;
                    case 1:
                        chuc3 = "eleven";
                        break;
                    case 2:
                        chuc3 = "twelve";
                        break;
                    case 3:
                        chuc3 = "thirteen";
                        break;
                    case 4:
                        chuc3 = "forteen";
                        break;
                    case 5:
                        chuc3 = "fifteen";
                        break;
                    case 6:
                        chuc3 = "sixteen";
                        break;
                    case 7:
                        chuc3 = "seventeen";
                        break;
                    case 8:
                        chuc3 = "eighteen";
                        break;
                    case 9:
                        chuc3 = "nineteen";
                        break;

                }
                System.out.println(tram3 + " " + chuc3);
            } else {
                switch (number2 / 10) {
                    case 2:
                        chuc3 = "twenty";
                        break;
                    case 3:
                        chuc3 = "thirty";
                        break;
                    case 4:
                        chuc3 = "forty";
                        break;
                    case 5:
                        chuc3 = "fifty";
                        break;
                    case 6:
                        chuc3 = "sixty";
                        break;
                    case 7:
                        chuc3 = "seventy";
                        break;
                    case 8:
                        chuc3 = "eighty";
                        break;
                    case 9:
                        chuc3 = "ninety";
                        break;

                }
                switch (number2 % 10) {
                    case 1:
                        donVi3 = "one";
                        break;
                    case 2:
                        donVi3 = "two";
                        break;
                    case 3:
                        donVi3 = "three";
                        break;
                    case 4:
                        donVi3 = "four";
                        break;
                    case 5:
                        donVi3 = "five";
                        break;
                    case 6:
                        donVi3 = "six";
                        break;
                    case 7:
                        donVi3 = "seven";
                        break;
                    case 8:
                        donVi3 = "eight";
                        break;
                    case 9:
                        donVi3 = "nice";
                        break;
                }

                System.out.println(tram3 + " " + chuc3 + " " + donVi3);
            }

        }
        if (number < 0 || number >= 1000) {
            System.out.println("Không dịch các số này ");
        }
    }


}