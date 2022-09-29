package com.example.myapplication;

import static com.example.myapplication.Triangle.REVERSE_TASK_RESULT_FALSE;
import static com.example.myapplication.Triangle.REVERSE_TASK_RESULT_TRUE;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleUnitTest {

    final Triangle triangle = new Triangle();

    @Test
    public void directTaskSolver_isCorrect() {
        triangle.setTaskDirection(true);
        triangle.setTaskContent(1);
        assertEquals(1, triangle.getDirectTaskResult());
        triangle.setTaskContent(2);
        assertEquals(3, triangle.getDirectTaskResult());
        triangle.setTaskContent(3);
        assertEquals(6, triangle.getDirectTaskResult());
        triangle.setTaskContent(4);
        assertEquals(10, triangle.getDirectTaskResult());
        triangle.setTaskContent(5);
        assertEquals(15, triangle.getDirectTaskResult());
        triangle.setTaskContent(6);
        assertEquals(21, triangle.getDirectTaskResult());
        triangle.setTaskContent(7);
        assertEquals(28, triangle.getDirectTaskResult());
        triangle.setTaskContent(8);
        assertEquals(36, triangle.getDirectTaskResult());
        triangle.setTaskContent(9);
        assertEquals(45, triangle.getDirectTaskResult());
        triangle.setTaskContent(10);
        assertEquals(55, triangle.getDirectTaskResult());
        triangle.setTaskContent(11);
        assertEquals(66, triangle.getDirectTaskResult());
        triangle.setTaskContent(12);
        assertEquals(78, triangle.getDirectTaskResult());
        triangle.setTaskContent(13);
        assertEquals(91, triangle.getDirectTaskResult());
        triangle.setTaskContent(14);
        assertEquals(105, triangle.getDirectTaskResult());
        triangle.setTaskContent(15);
        assertEquals(120, triangle.getDirectTaskResult());
        triangle.setTaskContent(16);
        assertEquals(136, triangle.getDirectTaskResult());
        triangle.setTaskContent(17);
        assertEquals(153, triangle.getDirectTaskResult());
    }
    @Test
    public void reverseTaskSolver_isCorrect() {
        triangle.setTaskDirection(false);
        triangle.setTaskContent(1);
        assertEquals(REVERSE_TASK_RESULT_TRUE, triangle.getReverseTaskResult());
        triangle.setTaskContent(3);
        assertEquals(REVERSE_TASK_RESULT_TRUE, triangle.getReverseTaskResult());
        triangle.setTaskContent(6);
        assertEquals(REVERSE_TASK_RESULT_TRUE, triangle.getReverseTaskResult());
        triangle.setTaskContent(10);
        assertEquals(REVERSE_TASK_RESULT_TRUE, triangle.getReverseTaskResult());
        triangle.setTaskContent(15);
        assertEquals(REVERSE_TASK_RESULT_TRUE, triangle.getReverseTaskResult());
        triangle.setTaskContent(21);
        assertEquals(REVERSE_TASK_RESULT_TRUE, triangle.getReverseTaskResult());
        triangle.setTaskContent(28);
        assertEquals(REVERSE_TASK_RESULT_TRUE, triangle.getReverseTaskResult());
        triangle.setTaskContent(36);
        assertEquals(REVERSE_TASK_RESULT_TRUE, triangle.getReverseTaskResult());
        triangle.setTaskContent(45);
        assertEquals(REVERSE_TASK_RESULT_TRUE, triangle.getReverseTaskResult());
        triangle.setTaskContent(55);
        assertEquals(REVERSE_TASK_RESULT_TRUE, triangle.getReverseTaskResult());
        triangle.setTaskContent(66);
        assertEquals(REVERSE_TASK_RESULT_TRUE, triangle.getReverseTaskResult());
        triangle.setTaskContent(78);
        assertEquals(REVERSE_TASK_RESULT_TRUE, triangle.getReverseTaskResult());
        triangle.setTaskContent(91);
        assertEquals(REVERSE_TASK_RESULT_TRUE, triangle.getReverseTaskResult());
        triangle.setTaskContent(105);
        assertEquals(REVERSE_TASK_RESULT_TRUE, triangle.getReverseTaskResult());
        triangle.setTaskContent(120);
        assertEquals(REVERSE_TASK_RESULT_TRUE, triangle.getReverseTaskResult());
        triangle.setTaskContent(136);
        assertEquals(REVERSE_TASK_RESULT_TRUE, triangle.getReverseTaskResult());
        triangle.setTaskContent(153);
        assertEquals(REVERSE_TASK_RESULT_TRUE, triangle.getReverseTaskResult());


        triangle.setTaskContent(2);
        assertEquals(REVERSE_TASK_RESULT_FALSE, triangle.getReverseTaskResult());
        triangle.setTaskContent(4);
        assertEquals(REVERSE_TASK_RESULT_FALSE, triangle.getReverseTaskResult());
        triangle.setTaskContent(5);
        assertEquals(REVERSE_TASK_RESULT_FALSE, triangle.getReverseTaskResult());
        triangle.setTaskContent(9);
        assertEquals(REVERSE_TASK_RESULT_FALSE, triangle.getReverseTaskResult());
        triangle.setTaskContent(14);
        assertEquals(REVERSE_TASK_RESULT_FALSE, triangle.getReverseTaskResult());
        triangle.setTaskContent(22);
        assertEquals(REVERSE_TASK_RESULT_FALSE, triangle.getReverseTaskResult());
        triangle.setTaskContent(25);
        assertEquals(REVERSE_TASK_RESULT_FALSE, triangle.getReverseTaskResult());
        triangle.setTaskContent(35);
        assertEquals(REVERSE_TASK_RESULT_FALSE, triangle.getReverseTaskResult());
        triangle.setTaskContent(44);
        assertEquals(REVERSE_TASK_RESULT_FALSE, triangle.getReverseTaskResult());
        triangle.setTaskContent(56);
        assertEquals(REVERSE_TASK_RESULT_FALSE, triangle.getReverseTaskResult());
        triangle.setTaskContent(63);
        assertEquals(REVERSE_TASK_RESULT_FALSE, triangle.getReverseTaskResult());
        triangle.setTaskContent(71);
        assertEquals(REVERSE_TASK_RESULT_FALSE, triangle.getReverseTaskResult());
        triangle.setTaskContent(96);
        assertEquals(REVERSE_TASK_RESULT_FALSE, triangle.getReverseTaskResult());
        triangle.setTaskContent(106);
        assertEquals(REVERSE_TASK_RESULT_FALSE, triangle.getReverseTaskResult());
        triangle.setTaskContent(124);
        assertEquals(REVERSE_TASK_RESULT_FALSE, triangle.getReverseTaskResult());
        triangle.setTaskContent(139);
        assertEquals(REVERSE_TASK_RESULT_FALSE, triangle.getReverseTaskResult());
        triangle.setTaskContent(151);
        assertEquals(REVERSE_TASK_RESULT_FALSE, triangle.getReverseTaskResult());
    }
}