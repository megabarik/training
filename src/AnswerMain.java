/**
 * Created by sbt-borisov-sv on 03.10.2017.
 */

public class AnswerMain {
    public static void main(String[] args){
        DestinationTrain dest = new DestinationTrain();
        dest.Destination();
        Price price = new Price();
        System.out.println("Стоимость билета(ов): " + price.sumPrice);

    }
}
