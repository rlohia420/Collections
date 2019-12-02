package collections.map.hashCodeAndEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashCodeAndEquals {

    public static void main(String args[]) {
        Employee e1 = new Employee("Name1", 1);
        Employee e2 = new Employee("Name2", 2);
        Employee e3 = new Employee("Name3", 3);
        Map<Employee, String> map = new HashMap<>();
        map.put(e1, "1");
        map.put(e1, "2");
        map.put(e3, "3");
        
        for(Entry<Employee,String> ent : map.entrySet()) {
            System.out.println(ent.getKey() + " - "+ent.getValue());
        }
        
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        if(i1.equals(i2)) {
            System.out.println("equals");
        }
        if(i1.compareTo(i2)==0) {
            System.out.println("equals");
        }
    }

}
