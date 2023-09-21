package com.Array.pack;

import java.util.ArrayList;
import java.util.List;
public class Grades {

    public static List<Integer> roundGrades(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();
        for (int i=0;i<grades.size();i++) {
            if (grades.get(i) >= 38) {
                int nextMultipleOf5 = ((grades.get(i) / 5) + 1) * 5;
                if (nextMultipleOf5 - grades.get(i) < 3) {
                    roundedGrades.add(nextMultipleOf5);
                } else {
                    roundedGrades.add(grades.get(i));
                }
            } else {
                roundedGrades.add(grades.get(i));
            }
        }
        return roundedGrades;
    }

    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(68);
        grades.add(38);
        grades.add(33);

        List<Integer> roundedGrades = roundGrades(grades);
        System.out.println(roundedGrades);
    }
}
