package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

import java.util.ArrayList;
import java.util.List;

public class HomeworkExercise implements HomeworkObservable{
    private final List<HomeworkObserver> homeworkObservers;
    private final List<String> exercises;
    private final String name;

    public HomeworkExercise(String name) {
        homeworkObservers = new ArrayList<>();
        exercises = new ArrayList<>();
        this.name = name;
    }

    public void addExercise(String exercise) {
        exercises.add(exercise);
        notifyMentor();
    }

    @Override
    public void addMentor(HomeworkObserver homeworkObserver) {
        homeworkObservers.add(homeworkObserver);
    }

    @Override
    public void notifyMentor() {
        for (HomeworkObserver homeworkObserver : homeworkObservers) {
            homeworkObserver.update(this);
        }
    }

    @Override
    public void removeMentor(HomeworkObserver homeworkObserver) {
        homeworkObservers.remove(homeworkObserver);
    }

    public List<String> getExercises() {
        return exercises;
    }

    public String getName() {
        return name;
    }
}
