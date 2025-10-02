package arraylist;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(23);
        a.add(34);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(10);
        b.add(21);
        b.add(37);
        b.add(92);

        ArrayList<Integer> c = new ArrayList<>();
        c.add(13);
        c.add(4);
        c.add(92);
        c.add(29);
        c.add(94);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c);

//        System.out.println(arr);
//
//        for (int i = 0; i < arr.size(); i++){
//            for (int j = 0; j < arr.get(i).size(); j++){
//                System.out.print(arr.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }

        arr.add(new ArrayList<>());
        arr.get(arr.size() - 1).add(20); // arr.getLast().add(20);
        arr.get(arr.size() - 1).add(49);
        arr.get(arr.size() - 1).add(34);

        for(ArrayList<Integer> list : arr){
            for (int ele : list){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
