import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite numero del que desea calcular el actorial");
        BigInteger n= new BigInteger(sc.nextLine());
        BigInteger fac = new BigInteger("1");
        BigInteger i= new BigInteger("1");
        while(true){
           if(i.longValue()==n.longValue()){
               fac=fac.multiply(i);
               break;
           }else{
               fac=fac.multiply(i);
           }

           i=i.add(BigInteger.valueOf(1));


        }
        System.out.println(fac.toString());


    }
}
