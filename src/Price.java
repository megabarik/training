/**
 * Created by sbt-borisov-sv on 03.10.2017.
 */
public class Price {
    public static int sumPrice;
    public void outPrice(int destination, int numberTime, int countTickets, int count){
        this.sumPrice = destination * numberTime * countTickets * count * 1000;

    }

}
