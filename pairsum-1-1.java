//pair sum-1
//2 pointer approach - O(n) - we can able to apply this approach here becoz this is SORTED ARRAY
import java.util.ArrayList;
public class solution {
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp) {
            if(list.get(lp)+list.get(rp)==target) return true;
            else if(list.get(lp)+list.get(rp)<target) lp++;
            else if(list.get(lp)+list.get(rp)>target) rp--;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(pairSum1(list,5));
    }
}
