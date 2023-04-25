public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");

        int clientOS;
//        clientOS = 1;
        clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Task 2");

        int clientDeviceYear = 2015;

        if (clientDeviceYear >= 2015) {
            if (clientOS ==0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS ==0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        System.out.println("Task 3");

        int year;

//        year = 2022;
        year = 2020;
//        year = 202;
//        year = 1234;


        if ((year % 400 == 0) | ((year % 4 ==0) && (year % 100 != 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Task 4");

        int distance;
//        distance = 120;
//        distance = 20;
        distance = 60;

        if (distance <= 20) {
            System.out.println("Потребуется дней " + 1);
        } else if (distance <= 60) {
            System.out.println("Потребуется дней " + 2);
        } else if (distance <= 100) {
            System.out.println("Потребуется дней " + 3);
        } else {
            System.out.println("Доставки нет");
        }

//        Доставка в пределах 20 км занимает сутки.
//                Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
//        Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
//                Свыше 100 км доставки нет.


        int monthNumber = 1;
//        monthNumber = 11;
        monthNumber = 21;
//        monthNumber = 5;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}