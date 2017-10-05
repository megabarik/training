/**
 * Created by sbt-borisov-sv on 03.10.2017.
 */
public class Price {
    public static int sumPrice;
    public void outPrice(int destination, int numberTime, int countTickets){
        this.sumPrice = destination * numberTime * countTickets * 1000;

    }

}
