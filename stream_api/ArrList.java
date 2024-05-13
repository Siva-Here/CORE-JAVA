package stream_api;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;


public class ArrList {

    public static void main(String args[]){
        List <Integer> nums=Arrays.asList(10,30,12,40,20,3);

        Stream <Integer>s1=nums.stream();

        // s1.forEach(n->System.out.println(n));

        Stream <Integer>s2=s1.filter(n->n%2==0);

        Stream <Integer> s3=s2.map(n->n*2);

        // int result=s3.reduce(0,(c,e)->c+e);


        // s2.forEach(n->System.out.println(n));
        // System.out.println(result);
        // s3.forEach(n->System.out.println(n));

        int result2=nums.stream()
            .filter(n->n%2==0)
            .map(n->n*2)
            .reduce(0,(c,e)->c+e);
        
        System.out.println(result2);
    }
}
