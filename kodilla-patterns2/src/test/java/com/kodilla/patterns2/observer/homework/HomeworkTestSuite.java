package com.kodilla.patterns2.observer.homework;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        // Given
        HomeworkExercise hardExercises = new HardExercises();
        HomeworkExercise easyExercises = new EasyExercises();

        HomeworkMentor johnSmith = new HomeworkMentor("John Smith");
        HomeworkMentor ivoneEscobar= new HomeworkMentor("Ivone Escobar");

        easyExercises.addMentor(johnSmith);
        hardExercises.addMentor(ivoneEscobar);
        easyExercises.addMentor(ivoneEscobar);

        // When
        hardExercises.addExercise("First Hard Exercise");
        hardExercises.addExercise("Second Hard Exercise");
        easyExercises.addExercise("First Easy Exercise");
        easyExercises.addExercise("Second Easy Exercise");
        easyExercises.addExercise("Third Easy Exercise");

        // Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(5, ivoneEscobar.getUpdateCount());
    }
}
