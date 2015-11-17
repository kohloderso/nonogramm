package models;
import com.google.common.collect.Sets;
import play.Logger;

import java.util.*;

/**
 * Created by Christina on 16.11.2015.
 */
public class Nonogramm {

    public int size_x;
    public int size_y;
    public int[][] grid;    // 0 for not set, 1 for full and -1 for empty

    public List<List<Integer>> numbers_x;
    public List<List<Integer>> numbers_y;

    public Nonogramm(int size_x, int size_y, List<List<Integer>> numbers_x, List<List<Integer>> numbers_y) {
        this.size_x = size_x;
        this.size_y = size_y;
        this.numbers_x = numbers_x;
        this.numbers_y = numbers_y;
        grid = new int[size_y][size_x];
    }

    public void findOverlaps() {
        int row = 0;
        for(List<Integer> numbers : numbers_y) {
            int max = numbers.stream().max(Integer::compare).get();
            int sum = numbers.stream().mapToInt(Integer::intValue).sum() + numbers.size()-1;
            if(max > size_x - sum) {
                //computeOverlaps(row);
            }
            row++;

        }
    }
//
//    public void computeOverlaps(int rowIndex) {
//        List<Integer> rowNumbers = numbers_y.get(rowIndex);
//        int count = rowNumbers.size();
//        List<Set<Integer>> assignmentsFromLeft = new ArrayList<Set<Integer>>();
//        int pointer = 0;
//        for(Integer n: rowNumbers) {
//            Set<Integer> assignment = new HashSet<Integer>();
//            for(; pointer < pointer + n; pointer++) {
//                assignment.add(pointer);
//            }
//            assignmentsFromLeft.add(assignment);
//        }
//        List<Set<Integer>> assignmentsFromRight = new ArrayList<Set<Integer>>();
//        pointer = size_x-1;
//        for(int i = count-1; i >= 0; i--) {
//            int n = rowNumbers.get(i);
//            Set<Integer> assignment = new HashSet<Integer>();
//            for(; pointer > pointer - n; pointer--) {
//                assignment.add(pointer);
//            }
//            assignmentsFromRight.add(assignment);
//        }
//        for(int i = 0; i < count; i++) {
//            Set<Integer> filled = Sets.intersection(assignmentsFromLeft.get(i), assignmentsFromRight.get(i));
//            fillSquares(rowIndex, filled);
//        }
//
//    }
//
//
//    public void fillSquares(int row, Collection<Integer> squares) {
//        for (Integer col: squares) {
//            grid[row][col] = 1;
//        }
//    }
//
//    public void print() {
//        for(int i = 0; i < size_y; i++) {
//            for(int j = 0; j > size_x; j++) {
//                Logger.info(" " + grid[i][j] + " ");
//            }
//        }
//    }




}
