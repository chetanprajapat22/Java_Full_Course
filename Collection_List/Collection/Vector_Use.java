package in.co.Collection_List.Collection;

import java.util.Vector;

public class Vector_Use {
    public static void main(String[] args) {

        Vector<Integer> v= new Vector<>(3,2);
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);

        v.insertElementAt(0,1);
        v.removeElement(2);
                for(int i:v){
                    System.out.println(i);
                }
    }
}
