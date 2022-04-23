package com.company.pz3_5.Floyd;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = promptTheUserToEnterADigit("Enter n:");
        int m = promptTheUserToEnterADigit("Enter m:");
        LinkedList<Integer> list = new LinkedList<>();
        int i ;
        for ( i = 0 ; i<n;i++){
            list.add(i);
        }
        i = 0;
        while (list.size()!=1){
            i+=m;
            if (i> list.size()-1){
                i=0;
            }
            list.remove(i);
        }
        System.out.println(list.get(0));

    }
    public static int promptTheUserToEnterADigit(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }
}
