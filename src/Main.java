public class Main {
    public static void main(String[] args) {
        //Ex1
        System.out.println("Задание номер один\n");
        int clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
        //Ex2
        System.out.println("\nЗадание номер два\n");
        int clientOS2 = 0;
        int clientDeviceYear = 2015;
        if  (clientDeviceYear>= 2015) {
            switch (clientOS2) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }
        } else {
            switch (clientOS2) {
            case 0:
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
                break;
            }
        }
        //Ex3
        System.out.println("\nЗадание номер три\n");
        int year = 2800;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Ex4
        //я сделала для любого расстояния, а не только до 100 км как в примере в условиях
        System.out.println("\nЗадание номер четыре\n");
        int deliveryDistance = 200;
        int deliveryDaysCount = 1; //доставка всегда минимум 1 день
        int distansAddAdditionalDay = 40; //каждый максимальный интервал дистанции, который добавляет один день доставки
        int remaningDistance = deliveryDistance - 20; //считаем сколько еще нужно будет проехать до клиента, чтобы узнать ->
        // -> сколько нужно дополнительных дней помимо одного дня
        if (remaningDistance != 0 && remaningDistance > 0) { // проверяем а есть ли  вообще эта дистанция и что она > 0
            if (remaningDistance % distansAddAdditionalDay != 0) { //если остаток != 0, то я далее добаляю один день, так ->
                //-> как не знаю как сделать округление без библиотек
                deliveryDaysCount += (remaningDistance / distansAddAdditionalDay) + 1;
            } else {
                deliveryDaysCount += remaningDistance / distansAddAdditionalDay;
            }
        }
        System.out.println("Потребуется дней: " + deliveryDaysCount);

        //Ex5
        System.out.println("\nЗадание номер пять\n");
        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Этот месяц принадлежит сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит сезону весна");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит сезону весна");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }
    }
}