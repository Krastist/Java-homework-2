public class Main {
    public static void main(String[] args) {

        int ticketPrice = 20999; //Стоимость билета
        System.out.println("Стоимость билета: " + ticketPrice);
        int costMile = 20; //Стоимость 1 мили
        System.out.println("Цена одной мили: " + costMile);
        int bonusMile = ticketPrice / costMile;  //Количество бонусных миль
        System.out.println("Количество бонусных миль: " + bonusMile);
    }
}
