import java.util.*;
public class linkedlist{
    public static void main(String args[]){
        LinkedList<Integer> a=new LinkedList<>();
        a.add(567);
        a.add(789);
        a.add(900);
        System.out.println(a);
        a.addFirst(89);
        System.out.println(a);
        a.addFirst(90);
        System.out.println(a);
    }
}