package Com.ash.emlektion2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /* Todo
        * new Arraylist
        * Add
        *
        *
        *
        *
        * */

        List<Integer>scoreList=new ArrayList<>();


        System.out.println(" Current scorelist "+scoreList);
        scoreList.add(25);
        scoreList.add(37);
        scoreList.add(150);
        System.out.println(" Current scorelist"+scoreList);

        scoreList.remove(0);
        System.out.println("after removing "+scoreList);

        //scoreList.get(0);
       // System.out.println(scoreList.get(0));// prints index

        for(int i=0;i<scoreList.size();i++){
            System.out.println("Index is " +scoreList.get(i));

        }
        scoreList.set(0,200);//param nr1 = index param nr 2 = value
        System.out.println("Current scorelist "+scoreList);

        System.out.println(Collections.max(scoreList));

        int x=Collections.max(scoreList);

        for (int i=0;i<scoreList.size();i++){

            System.out.println("Checking vaue " + scoreList.get(i));
            if (scoreList.get(i) == x
            ) {
                System.out.println("max value "+ scoreList.get(i)+ " on index "+i);
            }

        }


    }
}
