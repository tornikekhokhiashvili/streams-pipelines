package com.efimchick.ifmo;


import com.efimchick.ifmo.util.CourseResult;
import com.efimchick.ifmo.util.Person;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Collecting {

    public int sum(IntStream intStream) {
    }

    public int production(IntStream intStream) {
    }

    public int oddSum(IntStream intStream) {
    }

    public Map<Integer, Integer> sumByRemainder(int divider, IntStream intStream) {

    }

    public Map<Person, Double> totalScores(Stream<CourseResult> results) {

    }

    public double averageTotalScore(Stream<CourseResult> results) {

    }

    public Map<String, Double> averageScoresPerTask(Stream<CourseResult> results) {

    }

    public Map<Person, String> defineMarks(Stream<CourseResult> results) {

    }


    public String easiestTask(Stream<CourseResult> results) {

    }

    public Collector<CourseResult, ?, String> printableStringCollector() {

    }
}

