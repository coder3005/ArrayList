//maximum in an Arraylist
import java.util.ArrayList;
public class solution {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(2); 
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(10);

        //O(n)
        int max=list.get(0); //OR max=Integer.MIN_VALUE and we can start the value of i from 0
        for(int i=1;i<list.size();i++) {
            if(max<list.get(i)) { //in place of whole if we can also write max=Math.max(max,list.get(i));
                max=list.get(i);
            }
        }
        System.out.println(max);
    }
}
