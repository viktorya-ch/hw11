public class Main {
    public static void main(String[] args) {
        task1();
        showYear(2025);
        task2();
        offerToEliminate(0, 2016);
        task3();
        deliveryDays(95);

    }

    public static void task1() {
        System.out.println("task1");
    }

    public static void showYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосеный год");
        } else {
            System.out.println(year + " год - не високосный год");
        }
    }


    public static void task2() {
        System.out.println("task2");
    }

    public static void offerToEliminate(int operatingSystemType, int clientDeviceYear) {

        if (operatingSystemType == 1 && clientDeviceYear > 2015) {
            System.out.println(" Установите версию приложения для Android по ссылке ");
        } else if (operatingSystemType == 1 && clientDeviceYear <= 2015) {
            System.out.println(" Установите облегченную версию для Android по ссылке ");
        } else if (operatingSystemType == 0 && clientDeviceYear > 2015) {
            System.out.println(" Установите версию для IOS по ссылке");
        } else if (operatingSystemType == 0 && clientDeviceYear <= 2015) {
            System.out.println(" Установите облегченную версию для IOS по ссылке");
        } else {
            System.out.println("Неизвестная система");
        }
    }

    public static void task3() {
        System.out.println("task3");
    }

    public static void deliveryDays(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println(" Потребуется " + day + " день ");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println(" Потребуется " + (day + 1) + " дня ");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println(" Потребуется " + (day + 2) + " дня ");
        } else if (deliveryDistance > 100) {
            System.out.println(" Доставки нет");
        }
    }

}









