package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i <50; i++){
            arrayList.add(random.nextInt(100));
        }
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (Integer integer:arrayList)
        if(integer%2 == 0){
            arrayList1.add(integer);
        }else {
            arrayList2.add(integer);

        }
        System.out.println(arrayList1);
        System.out.println(arrayList2);
    }
}
