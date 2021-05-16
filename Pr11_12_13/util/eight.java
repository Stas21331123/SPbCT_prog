package Pr11_12_13.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class eight {
    List l = Collections.synchronizedList(new ArrayList());
        public static void main(String[] args) {
            eight t = new eight();
            ArrayList al = new ArrayList();
            al.add("First element");
            al.add("Second element");
            al.add("Third element");
            Iterator it = al.iterator();
            while(it.hasNext()) {
                System.out.println((String)it.next());
            }
            System.out.println("\n");
            al.add(2,"Insertion");
            it = al.iterator();
            while(it.hasNext()){
                System.out.println((String)it.next());
            }
        }
    }
