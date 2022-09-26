public class Main {
    public static void main(String[] args) {

        int current = 200; // текущий баланс счёта
        int added = 1200; // добавлено на счёт
        int bonus;
        if (added > 1000) {
            bonus = added / 100;
        } else {
            bonus = 0;
        }


        System.out.println("Вы пополнили счёт на " + added);
        System.out.println("Размер бонуса составляет " + bonus);
        System.out.println("Текущий баланс счёта: " + (current + added + bonus));

    }
}