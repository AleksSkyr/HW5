import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        tesc1();
        tasc2();
        tasc3();
        tasc4();
        tasc5();


    }


    private static void tesc1() {
        System.out.println("Задача 1");

        int clientOs = 1;
        if (clientOs == 1) {
            System.out.println("Установите программу для Android по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите программу для IOS по ссылке");
        } else {
            System.out.println("Ошибка, OS не распознана.");
        }


//        char clientOS = '1';
//        switch (clientOS) {
//            case '0':
//                System.out.println("Установите программу для IOS по ссылке");
//                break;
//            case '1':
//                System.out.println("Установите программу для Android по ссылке");
//                break;
//            default:
//                System.out.println("Система не распознана");
    }

    public static void tasc2() {
        System.out.println("Задача 2");
        int versionOs = 2017;
        int clientOs = 1;

        if (clientOs == 1 && versionOs <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 1 && versionOs >= 2015) {
            System.out.println("Установите программу для Android по ссылке");
        }
        if (clientOs == 0 && versionOs >= 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOs == 0 && versionOs <= 2105)
            System.out.println("Установите программу для IOS по ссылке");

    }

    public static void tasc3() {
        System.out.println("Задача 2");
        int year = 2012;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Год является высокосным!");
        } else {
            System.out.println("Этот год не являеться высокосным");
        }

    }

    public static void tasc4() {
        System.out.println("Задача 4");
        int distance = 100;
        int deliveryDey = 1;

        if (distance <= 20) {
            System.out.println("Доставка составит " + deliveryDey + " день");
        }else if (distance > 20 && distance <= 60) {
            deliveryDey++;
            System.out.println("Доставка составит " + deliveryDey + " дней");
        }else if (distance > 60 && distance < 100) {
            deliveryDey = deliveryDey + 2;
            System.out.println("Доставка составит " + deliveryDey + " дней");
        }else{
            System.out.println("Доставка невозможна");
        }


    }
    public static void tasc5() {
        System.out.println("Задача 5");
    }
}

