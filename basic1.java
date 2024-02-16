import java.util.ArrayList;
public class solution {
    public static void main(String[] args) {
        //Java Collection Framework
        //like oops -> ClassName objectName=new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list.size());

        //print the arraylist
        for(int i=0;i<list.size();i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
