package com.KF48.ToDo.List.TaskService;

import com.KF48.ToDo.List.TaskModel.Task;
import com.KF48.ToDo.List.TaskRepository.TaskRepository;
import jakarta.persistence.Cacheable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class TaskServiceDAO {
    @Autowired
    private final TaskRepository repository;

public TaskServiceDAO(TaskRepository repository) {
        this.repository = repository;

    }
    public Task createTask(Task task){

    return repository.save(task);
    }
    //@Cacheable("allTasks")
    public List<Task> getAllTask(){
        return repository.findAll();
    }
    //@Cacheable(value = "taskById", key = "#id")
    public Task getTaskById(Long id){
        return repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Task not found"));
    }
    public Task updateTask(Long id, Task updateedTask){
       Task task = getTaskById(id);
       task.setTitle(updateedTask.getTitle());
       task.setDescription(updateedTask.getDescription());
       task.setCompleted(updateedTask.isCompleted());
       return repository.save(task);
    }
    public void deleteTask(Long id){

        repository.deleteById(id);
    }
}
