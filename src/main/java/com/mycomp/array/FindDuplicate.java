package com.mycomp.array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Find Duplicate in the array
input= {1,2,3,4,1,2,2,2,2};
output= [1=2,2=5]*/
public class FindDuplicate {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,1,2,2,2,2};
        Map<Integer,Integer> duplicateStoreMap = new HashMap();
        int length = num.length;

        for(int i =0;i<length;i++){
            if(duplicateStoreMap.containsKey(num[i])){
                duplicateStoreMap.put(num[i],duplicateStoreMap.get(num[i])+1);
            }
            else{
                duplicateStoreMap.put(num[i],1);
            }
        }

        List<Map.Entry<Integer, Integer>> collect = duplicateStoreMap.entrySet().stream().filter(e -> e.getValue() > 1).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(duplicateStoreMap);
    }
}
