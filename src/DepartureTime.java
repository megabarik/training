import java.util.Scanner;

/**
 * Created by sbt-borisov-sv on 03.10.2017.
 */
public class DepartureTime {
    public void departTime(int destination) {

        int numberTime;

        if (destination > -1 && destination < 6) {
            switch (destination) {
                case 1:
                    System.out.println("Время прибытия поезда:");
                    System.out.println("12:00 - [1]");
                    System.out.println("15:00 - [2]");
                    System.out.println("18:00 - [3]");
                    break;
                case 2:
                    System.out.println("Время прибытия поезда:");
                    System.out.println("10:00 - [1]");
                    System.out.println("13:00 - [2]");
                    System.out.println("16:00 - [3]");
                    break;
                case 3:
                    System.out.println("Время прибытия поезда:");
                    System.out.println("08:00 - [1]");
                    System.out.println("11:00 - [2]");
                    System.out.println("15:00 - [3]");
                    break;
                case 4:
                    System.out.println("Время прибытия поезда:");
                    System.out.println("09:00 - [1]");
                    System.out.println("12:00 - [2]");
                    System.out.println("18:00 - [3]");
                    break;
                case 5:
                    System.out.println("Время прибытия поезда:");
                    System.out.println("18:00 - [1]");
                    System.out.println("21:00 - [2]");
                    System.out.println("23:00 - [3]");
                    break;
                default:
                    System.out.println("Вы ввели не цифру!");
                    break;
            }
        } else {
            System.out.println();
            System.out.println("Цифра не соответствует направлению!");
            DestinationTrain dest = new DestinationTrain();
            dest.Destination();
        }
        System.out.println();
        System.out.print("Выберите время согласно цифры: ");
        Scanner sc = new Scanner(System.in);
        while(!sc.hasNextInt()){
            if (!sc.hasNextInt()) {
                System.out.println("Вы ввели не цифру!");
                System.out.print("Введите цифру направления: ");
                sc = new Scanner(System.in);
            }

        }
        numberTime = sc.nextInt();

        //Передаем в DepartureTime
        PassengersCount countPass = new PassengersCount();
        countPass.variantsFree(destination, numberTime);
    }


}

