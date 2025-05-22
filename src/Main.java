import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws MyEmptyStackException {

        /*
        ArrayList<Object> stringArrayList = new ArrayList();


        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("String");

        HashMap<String, Double> grades = new HashMap<>();
        grades.put("Eylül",100.0);
        System.out.println(grades);
        grades.put("Öykü",100.0);
        System.out.println(grades);
        grades.put("Azra",100.0);
        System.out.println(grades);
        grades.put("Deniz",100.0);
        System.out.println(grades);
        grades.put("Mete",100.0);
        System.out.println(grades);
        grades.put("Mete",60.0);
        System.out.println(grades);

        System.out.println(grades.keySet());
        System.out.println(grades.values());
        System.out.println(grades.keySet() instanceof List);
        System.out.println(grades.keySet().getClass());
        System.out.println(grades.keySet() instanceof Set);
         */

        // Stack stack = new StackArray();
        Stack stack = new StackLinkedList();
        // stack.pop();
        try{
            stack.pop();
        }catch (Exception e){
            System.out.println(e);
        }






    }
}