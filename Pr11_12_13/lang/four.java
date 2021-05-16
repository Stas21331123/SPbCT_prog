package Pr11_12_13.lang;

public class four {
    public static void main(String[] args) {
        int i = 1;
        byte b = 1;
        String value = "1000";
        Integer iObj = Integer.valueOf(i);
        Byte bObj = Byte.valueOf(b);
        System.out.println("while i==b is " +
                (i==b));
        System.out.println("iObj.equals(bObj) is "
                + iObj.equals(bObj));
        Long lObj = Long.valueOf(value);
        System.out.println("lObj = " +
                lObj.toString());
        Long sum = Long.valueOf(lObj.longValue() +
                iObj.byteValue() +
                bObj.shortValue());
        System.out.println("The sum = " +
                sum.doubleValue());
    }
}
