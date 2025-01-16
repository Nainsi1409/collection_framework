import java.util.LinkedHashMap;

public class NonGenericLinkedHashMapForEach {
    public static void main(String[] args) {
        LinkedHashMap lhm = new LinkedHashMap();
        System.out.println(" NonGenericLinkedHashMapForEach");
        lhm.put("Akshita",1);
        lhm.put("Parmar",2);
        lhm.put("Abhijeet",3);
        lhm.put("coding",4);

        System.out.println("The Mapping of Akshita is : "+lhm.get("Akshita"));
        System.out.println("The Mapping of Abhijeet is : "+lhm.get("Abhijeet"));
        System.out.println("The Reverse of list is : "+lhm.reversed());
        System.out.println("The first entry  is : "+lhm.firstEntry());

        for (Object o: lhm.keySet()){
            System.out.println(lhm);
        }
    }
}