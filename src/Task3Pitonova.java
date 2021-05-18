import java.util.Scanner;

public class Task3Pitonova {
    //Task 1
    public static void main(String[] args) {
        System.out.println("CheckPassFail");
        System.out.println("Введите свою оценку");
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();
        double a = 50; // оценка
        if (mark >= a) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        System.out.println("DONE");

        //Task 2
        System.out.println("CheckOddEven");
        System.out.println("Введите переменную");
        Scanner scanner1 = new Scanner(System.in);
        int number = scanner1.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        System.out.println("BYE");

        //Task 3 if...else
        System.out.println("PrintNumberInWord(if...else)");
        System.out.println("Введите число ");
        Scanner scanner2 = new Scanner(System.in);
        int numberInWord = scanner2.nextInt();
        if (numberInWord == 1) {
            System.out.println("One");

        } else if (numberInWord == 2) {
            System.out.println("Two");

        } else if (numberInWord == 3) {
            System.out.println("Three");

        } else if (numberInWord == 4) {
            System.out.println("Four");

        } else if (numberInWord == 5) {
            System.out.println("Five");

        } else if (numberInWord == 6) {
            System.out.println("Six");

        } else if (numberInWord == 7) {
            System.out.println("Seven");

        } else if (numberInWord == 8) {
            System.out.println("Eight");

        } else if (numberInWord == 9) {
            System.out.println("Nine");

        } else {
            System.out.println("Other");
        }

        //Task 3 switch
        System.out.println("PrintNumberInWord(switch)");
        System.out.println("Введите число ");
        Scanner scanner3 = new Scanner(System.in);
        int numberInWord1 = scanner3.nextInt();
        String word;
        switch (numberInWord1) {
            case 1:
                word = "One";
                break;
            case 2:
                word = "Two";
                break;
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;
            case 6:
                word = "Six";
                break;
            case 7:
                word = "Seven";
                break;
            case 8:
                word = "Eight";
                break;
            case 9:
                word = "Nine";
                break;
            default:
                word = "Other";

        }

        System.out.println(word);

        //Task 4 if...else
        System.out.println("PrintDayInWord (if...else)");
        System.out.println("Введите число ");
        Scanner scanner4 = new Scanner(System.in);
        int day = scanner4.nextInt();
        if (day == 1) {
            System.out.println("Monday");

        } else if (day == 2) {
            System.out.println("Tuesday");

        } else if (day == 3) {
            System.out.println("Wednesday");

        } else if (day == 4) {
            System.out.println("Thursday");

        } else if (day == 5) {
            System.out.println("Friday");

        } else if (day == 6) {
            System.out.println("Saturday");

        } else if (day == 7) {
            System.out.println("Sunday");

        } else {
            System.out.println("Not a valid day");
        }

        //Task 4 switch
        System.out.println("PrintDayInWord (Switch)");
        System.out.println("Введите число ");
        Scanner scanner5 = new Scanner(System.in);
        int number2 = scanner5.nextInt();
        String day2;
        switch (number2) {
            case 1:
                day2 = "Monday";
                break;
            case 2:
                day2 = "Tuesday";
                break;
            case 3:
                day2 = "Wednesday";
                break;
            case 4:
                day2 = "Thursday";
                break;
            case 5:
                day2 = "Friday";
                break;
            case 6:
                day2 = "Saturday";
                break;
            case 7:
                day2 = "Sunday";
                break;
            default:
                day2 = "Not a valid day";
        }
        System.out.println(day2);

        //Task 5
        System.out.println("Task 5");
        int numberCompare = 7;
        int numberCompare1 = 7;
        if (numberCompare > numberCompare1) {
            System.out.println("The number " + numberCompare + " has the greatest value");

        } else if (numberCompare < numberCompare1) {
            System.out.println("The number " + numberCompare1 + " has the greatest value");
        } else if (numberCompare == numberCompare1) {
            System.out.println("The numbers are equal");
        }

        //Task 6
        System.out.println("Task 6");
        System.out.println("Уравнение: a*x + b = 0");
        Scanner input = new Scanner(System.in);
        System.out.println("Пожалуйста, введите значение a");
        double a1 = input.nextDouble();
        System.out.println("Пожалуйста, введите значение b");
        double b1 = input.nextDouble();
        double x;
        String answer;
        if (a1 == 0) {
            System.out.println("Уравнение не имеет решения");

        } else if (b1 == 0 && a1 == 0) {
            System.out.println("Уравнение имеет бесконечное количество корней");

        } else if (b1 == 0 && a1 != 0) {
            System.out.println("x= 0");

        } else if (b1 != 0 && a1 != 0) {
            x = -b1 / a1;
            System.out.println("x = " + x);

        }

        //Task 7
        System.out.println("Task 7");
        Scanner inputSale = new Scanner(System.in);
        System.out.println("Введите сколько продаж совершил менеджер");
        int sale1 = inputSale.nextInt();
        int salary = 1000;
        int salaryBonus;
        int bonus = 250;
        if (sale1 <= 10) {
            System.out.println("Зарплата менеджера " + salary + "$");
        } else if (sale1 > 10) {
            salaryBonus = salary + bonus;
            System.out.println("Зарплата менеджера " + salaryBonus + "$");
        }

        //Task 8
        System.out.println("Task 8");
        Scanner input2 = new Scanner(System.in);
        System.out.println("Введите сколько продаж совершил менеджер");
        int sale2 = input2.nextInt();
        int a3;
        if (sale2 >= 10) {
            System.out.println("Менеджер заработал бонус!");
        } else if (sale2 < 10) {
            a3 = 10 - sale2;
            System.out.println("До бонуса осталось " + a3 + " продаж(и)");
        }

        //Task 9
        System.out.println("Task 9");
        Scanner input3 = new Scanner(System.in);
        System.out.println("Введите возраст жены");
        int woman = input3.nextInt();
        System.out.println("Введите возраст мужа");
        int man = input3.nextInt();
        if (woman >= 35) {
            if (man >= 35) {
                System.out.println("Ипотека одобрена!");
            } else if (man < 35) {
                System.out.println("Ипотека не одобрена.");
            }
        } else if (man >= 35) {
            if (woman < 35) {
                System.out.println("Ипотека не одобрена.");
            }
        } else if (man < 35 && woman < 35) {
            System.out.println("Ипотека не одобрена");
        }

        //Task 10
        System.out.println("Task 10");
        Scanner input4 = new Scanner(System.in);
        System.out.println("Введите номер от 1 до 5");
        int number3 = input4.nextInt();
        String finger;
        switch (number3) {
            case 1:
                finger = "Большой";
                break;
            case 2:
                finger = "Указательный";
                break;
            case 3:
                finger = "Средний";
                break;
            case 4:
                finger = "Безымянный";
                break;
            case 5:
                finger = "Мизинец";
                break;
            default:
                finger = "Введите число от 1 до 5";
        }
        System.out.println(finger);


    }


}

