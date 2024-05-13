package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrList {

    public static void main(String args[]){
        List <Integer> nums=new ArrayList<Integer>();
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        System.out.println(nums);
        System.out.println(nums.get(2));
        System.out.println(nums.contains(3));
        System.out.println(nums.getFirst());
        System.out.println(nums.getLast());
        System.out.println(nums.isEmpty());
        System.out.println(nums.indexOf(7));
        System.out.println(nums.remove(0));
        System.out.println(nums);
        System.out.println(nums.removeFirst());
        System.out.println(nums);
        // System.out.println(nums.removeAll(nums));
        // System.out.println(nums);
        System.out.println(nums.reversed());
        System.out.println(nums);
        System.out.println(nums.set(2, 4));
        System.out.println(nums);
        nums.addFirst(10);
        System.out.println(nums);
        nums.addLast(30);
        System.out.println(nums);
        // nums.clear();
        // System.out.println(nums);

        Collections.sort(nums);
        System.out.println(nums);
        
        
    }
}
