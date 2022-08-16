public class Main {
    public static void main(String[] args) {
        byte a = 0;
        short b = 1;
        int c = 2;
        long d = 3;
        float e = 0.1f;
        double f = 1.1;


        System.out.println("Задача 2");
        float boxMan1 = 78.2f;
        double boxMan2 = 82.7;
        double sumBoxMan = boxMan1 + boxMan2;
        double resBoxMan = boxMan1 - boxMan2;
        System.out.println("сумма бохеров - " + sumBoxMan);
        System.out.println("разница боксеров - " + resBoxMan);

        System.out.println("Задача 3");
        var grammBananas = 5 * 80;
        double grammMilk = 200 / 100 * 105;
        var grammIceMilk = 2 * 100;
        var grammEggs = 4 * 70;
        var sumGram = grammBananas + grammMilk + grammIceMilk + grammEggs;
        double summ = (grammBananas + grammMilk + grammIceMilk + grammEggs) / 1000;
        System.out.println("Всего грамм - " + sumGram + ". КГ завтрака - " + summ);

        System.out.println("Задача 4");
        var days250 = 7000 / 250;
        var days500 = 7000 / 500;
        System.out.println("Для похудения по 250 грамм потребуется - " + days250);
        System.out.println("Для похудения по 500 грамм потребуется - " + days500);

        System.out.println("Задача 5");
        double mashaZP = 67760;
        double deisZP = 83690;
        double karinaZP = 76230;
        double mashaZPAfter = mashaZP * 1.1;
        double mashaPlus = mashaZPAfter - mashaZP;
        double deisZPAfter = deisZP * 1.1;
        double deisPlus = deisZPAfter - deisZP;
        double karinaZPAfter = karinaZP * 1.1;
        double karinaPlus = karinaZPAfter - karinaZP;
        System.out.println("Маша теперь получает " + mashaZPAfter + " рублей. Годовой доход вырос на " + mashaPlus + " рублей");
        System.out.println("Денис теперь получает " + deisZPAfter + " рублей. Годовой доход вырос на " + deisPlus + " рублей");
        System.out.println("Карина теперь получает " + karinaZPAfter + " рублей. Годовой доход вырос на " + karinaPlus + " рублей");
    }
}