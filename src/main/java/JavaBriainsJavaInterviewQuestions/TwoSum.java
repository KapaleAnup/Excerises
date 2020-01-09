package JavaBriainsJavaInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String [] args){

        int[] num = {2,4,6,3,8};
        int target = 7;
        int[] result= getTwoSum(num,target);
        System.out.println(result[0] +" " +result[1]);

    }

    public static int[] getTwoSum(int[] num, int target) {

        Map<Integer, Integer> map= new HashMap<Integer, Integer>();


        for (int i = 0; i < num.length; i++) {

            int delta = target - num[i];
            if(map.containsKey(delta)){

                return new int[]{i,map.get(delta)};
            }
            map.put(num[i], i);
        }
        return new int[]{-1, -1};

    }
}
