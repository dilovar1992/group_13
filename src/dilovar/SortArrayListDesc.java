package dilovar;

import java.util.*;

public class SortArrayListDesc {
     //write a method which sorts Arraylist in descending order
     public static void main(String[] args) {
         ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(45, 25, 11, 0, 3, 89, 55));
         System.out.println("SortDesc(nums) = " + SortDesc(nums));
     }
     public static ArrayList<Integer> SortDesc(ArrayList<Integer>nums){
         for (int i = 0; i < nums.size(); i++) {
             for (int j = 0; j < nums.size()-1; j++) {
                 int n1= nums.get(j);
                 int n2=nums.get(j+1);
                 if (n1<n2){
                     int temp=n1;
                     nums.set(j,n2);
                     nums.set(j+1,temp);

                 }

             }

         }

         return nums;
     }
}
