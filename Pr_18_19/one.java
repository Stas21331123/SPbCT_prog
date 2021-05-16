package Pr_18_19;
import java.net.*;
public class one {
    public static void main(String[] args) {
        InetAddress bsu = null;
        try{
            bsu = InetAddress.getByName("www.sutkt.ru");
        } catch (UnknownHostException e){
            System.out.println(e);
        }
        System.out.println(bsu);
    }
}
