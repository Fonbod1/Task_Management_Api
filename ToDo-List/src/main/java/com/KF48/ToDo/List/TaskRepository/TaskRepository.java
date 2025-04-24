package com.KF48.ToDo.List.TaskRepository;

import com.KF48.ToDo.List.TaskModel.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
