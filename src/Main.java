public class Main {


    public static void main(String[] args) {

        System.out.println("PrintOut HomeWork7");


        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();

    }

    public static void Task1() {

        int monthlyAdd = 15000;
        int currentSum = 0;
        int targetSum = 2459000;
        int month = 0;


        System.out.println(" Task 1 printout");

        do {

            System.out.println("Месяц " + month + "  сумма накоплений равна :" + currentSum + "  рублей");
            month = month + 1;
            currentSum = currentSum + monthlyAdd;

        }  while (currentSum <= targetSum);
        System.out.println("Потребуется " + month+ "месяцев");
    }

    public static void Task2() {
        int i = 1;
        System.out.println(" Task 2 printout");

        while (i < 11) {
            System.out.print(i + "   ");
            i = i + 1;
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j + "   ");
        }
    }

    public static void Task3() {
        int population = 12_000_000;
        int yearlyBirth = 17*12_000_000/1000;
        int yearlyDeath = 8*12_000_000/1000;
        int year = 0;

        System.out.println("Task 3 printout");

        while (year < 11) {
            System.out.println("Год " + year + " численность населения составляет " + population);
            population = population + yearlyBirth - yearlyDeath;
            year = year + 1;
        }

    }

    public static void Task4() {

        float initialSum = 15_000;
        float targetSum = 12_000_000;
        float percentage = 7;
        float currentSum = 0;
        int month = 1;

        System.out.println("Task 4 printout");
        currentSum = initialSum;

        while (currentSum < targetSum) {

            currentSum = currentSum + currentSum * percentage / 100;
            month = month + 1;
            System.out.println("Месяц " + month + "   накопления:" + currentSum);

        }
    }

    public static void Task5() {

        float initialSum = 15_000;
        float targetSum = 12_000_000;
        float percentage = 7;
        float currentSum = 0;
        int month = 1;
        float resDiv6;

        System.out.println("Task 5 printout");
        currentSum = initialSum;

        while (currentSum < targetSum) {

            currentSum = currentSum + currentSum * percentage / 100;

            if (month % 6 == 0) {
                System.out.println("Месяц " + month + "   накопления:" + currentSum);
            }
            month = month + 1;
        }
    }

    public static void Task6() {

        float initialSum = 15_000;
        float percentage = 7;
        float currentSum = 0;
        int month = 1;
        int years = 9;
        int months = years * 12;
        float resDiv6;

        System.out.println("Task 6 printout");
        currentSum = initialSum;

        while (month <= months) {

            currentSum = currentSum + currentSum * percentage / 100;

            if (month % 6 == 0) {
                System.out.println("Месяц " + month + "   накопления:" + currentSum);
            }
            month = month + 1;
        }

    }

    public static void Task7() {

        int firstFriday = 1;
        int weekLengh = 7;
        int monthLengh = 31;
        int currFriday;

        System.out.println("Task 7 printout");
        currFriday = firstFriday;

        while (currFriday <= monthLengh) {

            System.out.println("Сегодня пятница," + currFriday + "-е число. Необходимо подготовить отчет");
            currFriday = currFriday + weekLengh;
        }

    }

    public static void Task8() {

        int firstAppearance = 0;
        int period = 79;
        int currentYear = 2023;
        int startPeriod = 200;
        int finishPeriod = 100;
        int currYear = firstAppearance;

        System.out.println("Task 8 printout");

        currYear = firstAppearance;

        while (currYear > firstAppearance - startPeriod && currYear < currentYear + finishPeriod) {

            if (currYear >= currentYear - startPeriod && currYear <= currentYear+finishPeriod)

                System.out.println(currYear);
                currYear = currYear + period;


        }
    }
}