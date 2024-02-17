//pair sum-1
//brute force approach - O(n^2) - all possible pairs
import java.util.ArrayList;
public class solution {
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        for(int i=0;i<list.size();i++) {
            for(int j=i+1;j<list.size();j++) {
                if(list.get(i)+list.get(i+1)==target) {
                    return true;
                }
            }
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
        System.out.println(pairSum1(list,50));
    }
}
