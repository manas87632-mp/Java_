import java.util.*;

public class TreeSetDemo1 {   
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();  

        ts.add("life");
        ts.add("is");
        ts.add("very");
        ts.add("beautiful");

        System.out.println(ts);  

        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println(ts.contains("is")); 
    }
}
