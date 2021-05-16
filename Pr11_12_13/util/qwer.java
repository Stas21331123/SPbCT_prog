package Pr11_12_13.util;

import java.util.Locale;

public class qwer {
    public static void main(String[] args) {
        qwer test = new qwer();
        Locale l = Locale.getDefault();
        System.out.println(l.getCountry() + " " +
                l.getDisplayCountry() + " " + l.getISO3Country());
        System.out.println(l.getLanguage() + " " +
                l.getDisplayLanguage() + " " + l.getISO3Language());
        System.out.println(l.getVariant() + " " + l.getDisplayVariant());
        l = new Locale("ru","RU","WINDOWS");
        System.out.println(l.getCountry() + " " +
                l.getDisplayCountry() + " " + l.getISO3Country());
        System.out.println(l.getLanguage() + " " +
                l.getDisplayLanguage() + " " + l.getISO3Language());
        System.out.println(l.getVariant() + " " + l.getDisplayVariant());
    }
}
