import models.Nonogramm;
import play.Application;
import play.GlobalSettings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Christina on 16.11.2015.
 */
public class Global extends GlobalSettings {

    /*@Override
    public void onStart(Application app) {
        *//* Create 5 x 6 Nonogram
         *//*
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        List<Integer> list2 = new ArrayList<>();
        list1.add(3);
        List<Integer> list3 = new ArrayList<>();
        list1.add(3);
        list1.add(1);
        List<Integer> list4 = new ArrayList<>();
        List<Integer> list5 = new ArrayList<>();
        list1.add(4);
        List<Integer> list6 = new ArrayList<>();
        list1.add(5);
        List<List<Integer>> numbers_y = new ArrayList<>();
        Collections.addAll(numbers_y, list1, list2, list3, list4, list5, list6);
        List<List<Integer>> numbers_x = new ArrayList<>();

        Nonogramm test = new Nonogramm(6, 5, numbers_x, numbers_y);
        test.findOverlaps();
        test.print();
    }*/
}
