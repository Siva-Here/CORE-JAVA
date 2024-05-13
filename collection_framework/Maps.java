package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String args[]){

        Map <String,Integer> students=new HashMap<String,Integer>();

        students.put("Siva",99);
        students.put("Gowtham",90);
        students.put("Geetha",80);
        students.put("Vignesh",88);
        students.put("charan",89);

        System.out.println(students);
        System.out.println(students.get("Siva"));
        System.out.println(students.keySet());
        System.out.println(students.values());

        for(String key:students.keySet()){
            System.out.println(key + " : "+students.get(key));
        }

    }
}
