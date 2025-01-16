import java.util.Iterator;
import java.util.TreeMap;

public class NonGenericTreeMapHasNext {

    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        System.out.println("NonGenericTreeMapHasNext");
        tm.put("Akshita",1);
        tm.put("parmar",2);
        tm.put("coding",3);
        tm.put("java",4);
        System.out.println("The Size is : "+tm.size());
        System.out.println("The firstentry is : "+tm.firstEntry());
        System.out.println("The reversed is : "+tm.reversed());
        Iterator itr = tm.entrySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

