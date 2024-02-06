package telran.de.homework_5_30_01;
/*1) Создайте класса Enum для хранения перечня  месяцев в году.
Кроме костантных значений, в нем должен также сохраняться русское наименование месяца.
Напишите метод, который будет рекомендовать вам режим питания, в зависимости от текущего месяца и сезона года.
 */
public enum MonthOfYear {
    JANUARY("Январь"),
    FEBRUARY("Февраль"),
    MARCH("Март"),
    APRIL("Апрель"),
    MAY("Май"),
    JUNE("Июнь"),
    JULY("Июль"),
    AUGUST("Август"),
    SEPTEMBER("Сентябрь"),
    OCTOBER("Октябрь"),
    NOVEMBER("Ноябрь"),
    DECEMBER("Декабрь");

    private String title;

    MonthOfYear(String title) {
        this.title = title;
    }
    public static void getFoodOfSeason(MonthOfYear month) {
        switch (month) {
            case DECEMBER,JANUARY,FEBRUARY ->  {
                System.out.println("Сезон зимний, рекомендуется больше мясного");
            }

            case MARCH,APRIL,MAY -> {
                System.out.println("Сезон весенний, рекомендуется больше зелени, птицы и яйца");
            }

            case JUNE,JULY,AUGUST -> {
                System.out.println("Сезон летний, рекомендуется больше зелени, овощей и ягод");
            }

            case SEPTEMBER,OCTOBER,NOVEMBER -> {
                System.out.println("Сезон осенний, рекомендуется больше фруктов, овощей и рыбы");
            }


        }
    }

    MonthOfYear() {
    }

    @Override
    public String toString() {
        return "MonthOfYear{" +
                "title='" + title + '\'' +
                '}';
    }
}

