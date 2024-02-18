import java.util.ArrayList;
import java.util.Collections;
public class arraylist {
    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {

        ArrayList<Integer> result=new ArrayList<>();
        int n=nums.size();
        Collections.sort(nums);
        for(int i=0;i<n;i++) {
            if(i!=0 && (nums.get(i-1)==(nums.get(i)-1) || nums.get(i-1)==nums.get(i))) { //starting case
                continue;
            }
            if(i!=n-1 && (nums.get(i+1)==(nums.get(i)+1) || nums.get(i+1)==nums.get(i))) { //ending case
                continue;
            }
            result.add(nums.get(i));
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        System.out.println(findLonely(list));
    }
}
