/**
 * Created by Jakob on 30-08-2016.
 */

import java.util.LinkedList;
import java.util.*;

public class removeEvenInRange {

    public static void main (String[] args) {

        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.addAll(Arrays.asList(1, 1, 2, 0, 4, 5, 6, 8, 8, 3, 11, 9, 12, 0, 14, 0, 16));

        int startIndex = 5;
        int endex = 13;

        System.out.println(removeEvensInRange(ll, startIndex, endex));

    }
    public static LinkedList<Integer> removeEvensInRange (LinkedList <Integer> list, int start, int end)
    {



        for (int j = 0; j < list.size(); j++){


            int element = list.get(j);

            if (element >= start && element <= end) {

                if (element % 2 == 0) {
                    list.remove(j);
                    j--;
                }
            }
        }

        /*for (int k = start ; k <= end; k++){


            if (list.get(k) == null){
                list.remove(k);
                //Hvorfor fjerner du ikke list(6), som =null?
            }
        }
        */

        return list;
    }

}
