import java.util.Scanner;

/**
 * Created by sbt-borisov-sv on 03.10.2017.
 */
public class PassengersCount {
    int count = 0;
    public void variantsFree(int destination, int numberTime){
        if (numberTime == 3 && (destination == 1 || destination == 2 )) {
            count = (numberTime + destination)*4;
        } else {
            count = (numberTime + destination)*2;
        }
        System.out.println("По вашему направлению свободно: " + count + " мест.");
        System.out.print("Сколько вы хотите забронировать билетов? - ");
        Scanner sc = new Scanner(System.in);
        while(!sc.hasNextInt()){
            if (!sc.hasNextInt()) {
                System.out.println("Вы ввели не цифру!");
                System.out.print("Введите цифру направления: ");
                sc = new Scanner(System.in);
            }

        }
        int countTickets = sc.nextInt();
        Price setPrice = new Price();
        setPrice.outPrice(destination,numberTime,countTickets, count);
    }
}
