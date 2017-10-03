
import java.util.Scanner;


/**
 * Created by sbt-borisov-sv on 03.10.2017.
 */

public class DestinationTrain {
    String moscow = "Москва";
    String saintPetersburg = "Санкт-Петербург";
    String samara = "Самара";
    String krasnodar = "Краснодар";
    String saratov = "Саратов";
    int numberTrain;

//Выводим направление поездов и выбираем поезд
        public void Destination() {
            System.out.println("Направления поездов: ");
            String[] dest = {moscow, saintPetersburg, samara, krasnodar, saratov};
            for (int i = 0; i < dest.length; i++) {
                int sum = i + 1;
                System.out.println(dest[i] + " - [" + sum + "]");
            }
            System.out.println();

            System.out.print("Введите цифру направления: ");
            Scanner sc = new Scanner(System.in);
            //Проверяем на ввод цифр
            while(!sc.hasNextInt()){
                if (!sc.hasNextInt()) {
                    System.out.println("Вы ввели не цифру!");
                    System.out.print("Введите цифру направления: ");
                    sc = new Scanner(System.in);
                }

                }

                //Вносим цифру в переменную и передаем ее в Price
            numberTrain = sc.nextInt();
            //Передаем в DepartureTime
            DepartureTime depart = new DepartureTime();
            depart.departTime(numberTrain);

      }
}


