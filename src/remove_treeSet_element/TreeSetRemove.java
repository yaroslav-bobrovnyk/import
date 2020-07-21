package remove_treeSet_element;

import java.util.*;

public class TreeSetRemove {
    public static void main(String[] args) {
        Set<Object> set=new TreeSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("wally");
        System.out.println("TreeSet: "+set);
        List list= Arrays.asList(set.toArray());
        System.out.println("List: "+list);
        for (int i = 0; i <list.size() ; i++) {
            if ((i+1)==list.size()){
                Object setValue=list.get(i);
                set.remove(setValue);
            }
        }
        System.out.println("TreeSet without the last element: "+set);
    }
}
