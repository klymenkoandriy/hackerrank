package com.sigmaukraine.klymenko.andriy.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/ctci-ice-cream-parlor/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=search">Hash Tables: Ice Cream Parlor</a>
 */
public class IceCreamParlorSolution {

    static void whatFlavors(int[] cost, int money) {
        System.out.println(determine(cost, money));
    }

    public static String determine(int[] cost, int money) {

        Map<Integer,List<Integer>> values = new HashMap<>();
        for(int index = 0; index < cost.length; index++) {
            int val = cost[index];
            List<Integer> list = values.getOrDefault(val, new ArrayList<>());
            list.add(index);
            values.put(val, values.getOrDefault(val, list));
        }

        int res1 = -1;
        int res2 = -1;

        for(int firstVal : values.keySet()) {
            int secondVal = money - firstVal;
            List<Integer> found = values.get(secondVal);
            if(found != null) {
                if (firstVal == secondVal && found.size() >= 2) {
                    res1 = found.get(0);
                    res2 = found.get(1);
                } else if (firstVal != secondVal && found.size() >= 1) {
                    res1 = values.get(firstVal).get(0);
                    res2 = found.get(0);
                }
            }
        }

        return res1 < res2 ? (res1 + 1) + " " + (res2 + 1) : (res2 + 1) + " " + (res1 + 1);
    }
}
