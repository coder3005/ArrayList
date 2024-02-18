/*0 <= i <= nums.size() - 2,
nums.get(i) == key and,
nums.get(i+1) == target.
Return the target with the maximum count.
(Assumption- that the target with maximum count is unique.) */
import java.util.ArrayList;
public class arraylist {
    public static int mostFrequent(ArrayList<Integer> nums, int key) {
        int count[]=new int[1001];

        //building our counting array
        for(int i=1;i<nums.size()-1;i++) {
            if(nums.get(i)==key) {
                count[nums.get(i+1)]++;
            }
        }
        //finding the index with the greatest entry
        int maxValue=0;
        int target=0;
        for(int i=0;i<count.length;i++) {
            //maxValue=count[i]>count[maxValue]?i:maxValue;
            if(count[i]>maxValue) {
                target=i;
                maxValue=count[i];
            }
        }
        return target;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);
        System.out.println(mostFrequent(list,1));
    }
}
