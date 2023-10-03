import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //example of formatting
        double sales = 2224343.42;
        System.out.printf("The sales for the day is %f \n",sales);
        double num = 33373.55;
        System.out.printf("The sales for the number %f is %f\n",num,sales);
//        The %f is used for formatting floating point numbers and doubles
//        While the %d is used for integers and it stands for decimal


//        if you are working with really large numbers then it is more advisable to use the BigDecimal and BigInteger this is how it is done.
//       there is greater precision
        BigDecimal money = new BigDecimal(3349394.90);
        System.out.println(money.multiply(BigDecimal.valueOf(5)));

    }
}