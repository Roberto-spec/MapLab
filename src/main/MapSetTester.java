package main;

import java.lang.reflect.Array;
import java.util.*;

public class MapSetTester {
    public static void main(String[] args) {
        // Ваш код пишите здесь
        Map<String, TreeSet<String>> networkMap=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        String chanel,show;
        int i=0;
        do {
            System.out.print("TV network: ");
            chanel=scanner.nextLine();
            System.out.print("TV show on "+chanel+": ");
            show=scanner.nextLine();
            if(networkMap.containsKey(chanel)){
                networkMap.get(chanel).add(show);
            }
            else {
                TreeSet<String> newShows=new TreeSet<>();
                newShows.add(show);
                networkMap.put(chanel,newShows);


            }
            System.out.println(networkMap.toString());
            i++;
        }while(i<10);
        if(!networkMap.isEmpty()){
            String[] keys=networkMap.keySet().toArray(new String[0]);
            Arrays.sort(keys);

            for (int k=0;k<keys.length;k++){
                System.out.print(keys[k]+"="+networkMap.get(keys[k]).toString()+" ");

            }


        }


    }

}
