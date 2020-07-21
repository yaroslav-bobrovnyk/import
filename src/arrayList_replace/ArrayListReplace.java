package arrayList_replace;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListReplace {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        List<Object> list =new ArrayList<>();
        list.add('h');
        list.add("Mazda");
        list.add(1);
        list.add("Opel");
        System.out.println(list);
        System.out.println("Enter the element to replace the second: ");
        list.set(2,in.next());
        System.out.println(list);
    }
}
