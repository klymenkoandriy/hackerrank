package com.sigmaukraine.klymenko.andriy.queues;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/balanced-brackets/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues">Balanced Brackets</a>
 */
public class BalancedBracketsSolution {

    static String isBalanced(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('[', ']');
        map.put('(', ')');
        map.put('{', '}');
        Set keys = map.keySet();

        Deque<Character> stack = new LinkedList<>();

        for(char c : s.toCharArray()) {
            if(keys.contains(c)) {
                stack.push(c);
            } else {
                Character prev = stack.poll();
                if(prev == null || map.get(prev) != c) {
                    return "NO";
                }
            }
        }

        return stack.size() == 0 ? "YES" : "NO";
    }
}
