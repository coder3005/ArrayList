/* nums is a permutation of the integers in the range [1, n].
 For every 0 <= i < j < n, there is no index k with i < k < j where 2 * nums.get(k) == nums.get(i) +
nums.get(j).*/
import java.util.ArrayList;
public class arraylist {
    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        ans.add(1);
        while(ans.size()<n) {
            ArrayList<Integer> temp=new ArrayList<Integer>();
            int ans_size=ans.size();
            for(int i=0;i<ans_size;i++) {
                if((ans.get(i)*2-1)<=n) {
                    temp.add(ans.get(i)*2-1);
                }
            }
            for(int i=0;i<ans_size;i++) {
                if(ans.get(i)*2<=n) {
                    temp.add(ans.get(i)*2);
                }
            }
            ans=temp;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(beautifulArray(5));
    }
}
