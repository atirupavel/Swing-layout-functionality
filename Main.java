package swing;
import java.util.*;
public class Main{
    public static void main(String args[]){
        Queue ql=new LinkedList();
        ql.add("d");
        ql.offer(0);
     while(ql.iterator().hasNext()){
         System.out.print(ql.size());
     }    }
}