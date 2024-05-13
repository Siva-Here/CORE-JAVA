package collection_framework;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String args[]){
        Set <Integer> nums =new TreeSet<Integer>();

        nums.add(10);
        nums.add(50);
        nums.add(20);
        nums.add(70);
        nums.add(15);

        Iterator<Integer>values=nums.iterator();

        while(values.hasNext()){
            System.out.println(values.next());
        }

    }
}
