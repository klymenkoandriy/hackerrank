package com.sigmaukraine.klymenko.andriy.sorting.comparator;

import java.util.Comparator;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/ctci-comparator-sorting/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting">Sorting: Comparator</a>
 */
class Checker implements Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {
        int result = b.score - a.score;
        return result == 0 ? a.name.compareTo(b.name) : result;
    }
}
