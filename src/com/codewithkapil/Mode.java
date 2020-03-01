package com.codewithkapil;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Mode {


    public static void main(String args[])
    {
        int[] inputArray ={4,4,4,4,4,4,4,1,2,2,3,3,4,4,5,5,5,5,5,5,6,7,7,7,7,7};
        int maxTimRepeated=  calculatMode(inputArray);
        System.out.println("Mode is: "+maxTimRepeated);
    }

    public static int calculatMode(int[] inputArray){

        //using map to get no of time array elements is repeated

        Map<Integer,Integer> collectMap = new HashMap<>();
        int count=1;
        for(int i=0; i<inputArray.length;i++){


                if(collectMap.containsKey(inputArray[i]))
                {

                    count = collectMap.get(inputArray[i]) + 1 ;
                    collectMap.put(inputArray[i],count);
                }
                else{
                    count=1;
                    collectMap.put(inputArray[i],count);
                }
        }
        //find max value in map
        int maxValueInCollectMap=(Collections.max(collectMap.values()));

        //brings back the max key in map
        for(Map.Entry<Integer, Integer> entry: collectMap.entrySet()){

            if(entry.getValue()==maxValueInCollectMap){

                return entry.getKey();

            }

        }

        return -1;
    }

}
