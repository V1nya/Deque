package com.company.pz3_5.z1;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] first = {4, 3, 3, 8};
        int[] second = {2, 2, 7, 5, 3, 3};
       var in= findSumOfArrays(first,second);

        Arrays.stream(in).forEach(System.out::print);
    }


    static int[] findSumOfArrays(int[] first, int[] second) {

        Stack<Integer> f = new Stack<>();
        Stack<Integer> s = new Stack<>();
        int i = 0;
        while (i<second.length || i< first.length){
            if (i< first.length)
                f.push(first[i]);
            if (i<second.length)
                s.push(second[i]);

            i++;
        }
        i=0;
        Stack<Integer> answer = new Stack<>();
        int temp = 0;
        while (!f.empty() || !s.empty()){
            int sum=0;
            i++;
            if (!f.empty()) {
                 sum += f.pop();
            }
            if (!s.empty()){
                sum+=s.pop();
            }

           if (sum>=10){
               answer.push(sum%10+temp);
               temp=sum/10;
           }
           else {
               answer.push(sum+temp);
               temp=0;
           }


        }
        int[] an  = new int[i];
        i=0;
        while (!answer.empty()){
            an[i]=answer.pop();
            i++;
        }
        return an;
    }

}
