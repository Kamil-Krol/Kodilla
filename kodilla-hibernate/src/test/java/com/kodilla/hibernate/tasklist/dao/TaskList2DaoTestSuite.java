package com.kodilla.hibernate.tasklist.dao;



import com.kodilla.hibernate.tasklist.TaskList2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskList2DaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName()
    {
        //Given
        TaskList2 taskList2 = new TaskList2(1,"list","test");
        taskListDao.save(taskList2);
        String listName = taskList2.getListName();
        //When
        List<TaskList2> readTasks = taskListDao.findByListName(listName);
        //Then
        assertEquals(1, readTasks.size());

        //CleanUp
        int id = readTasks.get(0).getId();
        taskListDao.deleteById(id);
    }
}
