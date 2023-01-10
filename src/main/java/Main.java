import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 13, 5};
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(4);
        arr.add(5);
        arr.add(2);
        arr.add(23);
        arr.add(55);
        //array =
        //Summator sm = new Summator();
        AmountElements am = new AmountElements();

        System.out.println(am.amount(arr));
       // System.out.println(sm.sum(array.length, array));

    }


}
