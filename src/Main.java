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

    //Ex6
    /* И снова дела банковские, уже сложнее.
В нашем банке можно, кроме дебетовых, получать еще и кредитные карты. У таких карт есть допустимый лимит средств,
который рассчитывается исходя из возраста клиента и его зарплаты.

*Правила расчета следующие:*
Людям старше (или равно) 23 лет мы предоставляем лимит в размере 3 зарплат.
Людям младше 23 лет мы предоставляем лимит в размере 2 зарплат.
Если заработная плата клиента выше (или равно) 50 тысяч, мы увеличиваем лимит в 1.2 раза.
Если заработная плата выше (или равно) 80 тысяч, мы увеличиваем лимит в 1.5 раза.
Наша задача: написать программу, которая показывает, какую сумму на кредитке может получить клиент.
*Вводные данные:* переменная age = 19 для обозначения возраста клиента, salary = 58_000 для обозначения зарплаты клиента.
Увеличения не могут быть применены одновременно. Необходимо вывести максимальный лимит в консоль в формате: «Мы готовы
выдать вам кредитную карту с лимитом *** рублей».*/
    System.out.println("\nЗадание номер шесть\n");
    int age = 24;
    int salary = 58_000;
    int creditLimitOnSalary = 0;
    int creditLimitOnAge = 0;
    int maxLimit = 0;
    if (age >= 23) {
        creditLimitOnAge =  salary * 3;
    } else if (age >= 18){
        creditLimitOnAge =  salary * 2;
    }
    if (salary >= 80_000) {
        creditLimitOnSalary *= 1.5;
    } else if (salary >= 50_000) {
        creditLimitOnSalary *= 1.2;
    }
    if (creditLimitOnAge > creditLimitOnSalary) {
        maxLimit = creditLimitOnAge;
    } else {
        maxLimit = creditLimitOnSalary;
    }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + maxLimit + " рублей");

    //Ex7
    /*Расширим задачу с кредитованием. Прежде чем выдавать кредиты наш банк проводит аудит и оценивает клиентов и их
    возможность выплачивать кредит. Для того, чтобы вывести предварительное решение, нам необходимо использовать данные
    о возрасте, зарплате и желаемой сумме.

    *Правила следующие:*
    Базовая ставка для клиента — 10% годовых. Срок кредитования — 12 месяцев. Максимальный ежемесячный платеж — 50% от
    ЗП. Если возраст меньше 23, то добавляем 1% к ставке.Если возраст меньше 30, то добавляем 0.5% к ставке. Если
    зарплата больше 80_000, уменьшаем ставку на 0.7%.
    Нам нужно написать программу для предварительного одобрения/отказа заявки по кредиту.

    *Вводные данные:* используйте переменные age = 25 для обозначения возраста,salary = 60_000 для обозначения зарплаты,
    wantedSum = 330_000 для обозначения желаемой суммы кредита.
    Подсчитайте и выведите ответ, одобрен кредит или нет. На основании зарплаты подсчитайте максимальный допустимый
    платеж. Если максимальный допустимый платеж по ЗП больше стандартного платежа по кредиту согласно процентной ставке,
     то кредит одобрен, если меньше — отказан.
    Пример ответа в консоль: «Максимальный платеж при ЗП * равен * рублей. Платеж по кредиту *** рублей.
    Одобрено/отказано».
     */
    System.out.println("\nЗадание номер шесть\n");
    int age2 = 25;
    int salary2 = 90_000;
    int wantedSum = 330_000;
    double baseRate = 0.1;
    int  loanTerms = 12;
    double paymentPerMonth = 0;
    double maxPaymentPerMonth = salary2 * 0.5;
    if (age2 >= 23 && age2 < 30) {
        baseRate += 0.005;
    } else if (age >= 18){
        baseRate += 0.01;
    }
    if (salary >= 80_000) {
        baseRate -= 0.07;
    }
    paymentPerMonth = (wantedSum + wantedSum * baseRate)/loanTerms;
    if (maxPaymentPerMonth > paymentPerMonth) {
        System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxPaymentPerMonth + " рублей." +
                " Платеж по кредиту " + paymentPerMonth + " рублей. Одобрено!");
    } else {
        System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxPaymentPerMonth + " рублей." +
                " Платеж по кредиту " + paymentPerMonth + " рублей. Отказано!");
    }
    }
}