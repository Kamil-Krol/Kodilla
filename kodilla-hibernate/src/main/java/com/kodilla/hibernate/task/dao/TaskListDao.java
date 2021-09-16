package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.TasksList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface TaskListDao extends CrudRepository<TasksList,Integer> {

}
