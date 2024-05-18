public class Main {
    public static void main(String[] args) {
        int ticketPrice = 1376; // стоимость билета
        int oneBonusMile = 20; // хранения количества рублей для одной бонусной мили
        int bonusMiles = ticketPrice / oneBonusMile; // количество начисленных миль за купленный билет
        System.out.println("Количество начисленных миль за купленный билет: " + bonusMiles);
    }
}

