package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

public interface HomeworkObservable {
    void addMentor(HomeworkObserver homeworkObserver);
    void notifyMentor();
    void removeMentor(HomeworkObserver homeworkObserver);
}
