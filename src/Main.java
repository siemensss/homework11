import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 1836;
        checkTheLeap(year);
        System.out.println("Задача 2");
        int OS = 1;
        int yearOfProduction = 2023;
        DownloadApp(OS, yearOfProduction);
        System.out.println("Задача 3");
        int deliveryDays = 0;
        int deliveryDistance = 95;
        deliveryDays = countsTheNumberOfDeliveryDays(deliveryDistance);
        if (deliveryDays == -1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Количество дней доставки " + deliveryDays);
        }
    }

    public static void checkTheLeap(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год невисокосный");
        }
    }

    public static void DownloadApp(int OS, int yearOfProduction) {
        int currentYear = LocalDate.now().getYear();
        if (yearOfProduction < currentYear && OS == 0) {
            System.out.println("Скачайте облегчённую версию для iOS");
        } else if (yearOfProduction < currentYear && OS == 1) {
            System.out.println("Скачайте облегчённую версию для Android");
        } else if (yearOfProduction == currentYear && OS == 0) {
            System.out.println("Скачайте обычную версию для iOS");
        } else {
            System.out.println("Скачайте обычную версию для Android");
        }
    }

    public static int countsTheNumberOfDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            return deliveryDays;
        }
        if (deliveryDistance <= 60){
            return deliveryDays + 1;
        }
        if (deliveryDistance <= 100){
            return deliveryDays + 2;
        } else {
            return -1;
        }
    }
}