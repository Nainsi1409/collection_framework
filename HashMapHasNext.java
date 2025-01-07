import java.util.HashMap;
import java.util.Iterator;


public class HashMapHasNext {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String, Integer>();
        System.out.println("NAINSI BANGAR");
        System.out.println("HashMap Has Next");
        hm.put("Akshita",1);
        hm.put("Parmar",2);
        hm.put("coding",3);
        hm.put("java",4);
        System.out.println("The Mapping of Akshita is : "+hm.get("Akshita"));
        System.out.println("Size of string :"+hm.size());
        System.out.println(" remove the string : "+hm.remove("coding"));
        Iterator itr = hm.entrySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}