import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

public class LinkedHashMapHasNext {

    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<String,Integer>();
        System.out.println(" LinkedHashMap has next");
        lhm.put("Akshita",1);
        lhm.put("Parmar",2);
        lhm.put("coding",3);
        System.out.println("The Mapping of Akshita is : "+lhm.get(" Akshita "));
        System.out.println("The Mapping of coding is : "+lhm.get(" coding"));
        System.out.println(" the size is :"+lhm.size());

        Iterator itr = lhm.entrySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}