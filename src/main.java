import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        // numList empty: []

        numList.add(3);      //numList: [3]

        numList.add(0, 6);  //numList: [6, 3]

        numList.add(7); //numList: [6, 3, 7]

        numList.add(3, 8); // numlist:[6,3,8,7]

        numList.set(3, 9); //numList:[6,3,8,9]

        numList.add(1, 2); //numList:[6,2,3,8,9]

        numList.add(1, numList.size()); //numList:[6,5,2,3,8,9]

        numList.remove(4);//numList:[6,5,2,3,9]

        numList.set(4, 0);

        System.out.println(numList);



    }
}
