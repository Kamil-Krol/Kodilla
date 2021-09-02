package com.kodilla.patterns2.observer.homework;

public class HomeworkMentor implements HomeworkObserver{
    private final String mentorName;
    private int updateCount;

    public HomeworkMentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(HomeworkExercise homeworkExercise) {
        System.out.println(mentorName + "You have new exercise to review : " + homeworkExercise.getName() + "\n" +
                " (total: " + homeworkExercise.getExercises().size() + " exercises)");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
