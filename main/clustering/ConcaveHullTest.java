package main.clustering;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcaveHullTest {
    final static ConcaveHull.Point[] stackOverflowCase = {
        new ConcaveHull.Point(1.01, 101.01),
        new ConcaveHull.Point(1.01, 101.5),
        new ConcaveHull.Point(1.5, 101.5),
        new ConcaveHull.Point(1.5, 101.01)
    };

    static final List<ConcaveHull.Point> stackOutList = new ArrayList<>(Arrays.asList(stackOverflowCase));

    @Test
    public void testStackOverflowCase() {
        final ConcaveHull c = new ConcaveHull();
        List<ConcaveHull.Point> orderedHull = c.calculateConcaveHull(stackOutList, 2);
        assertNotNull(orderedHull);
        System.out.println("Hull test from GitHub");
        for (ConcaveHull.Point p: orderedHull) {
            System.out.print(" " + p);
        }
    }
}