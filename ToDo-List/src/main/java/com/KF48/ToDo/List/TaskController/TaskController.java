package com.KF48.ToDo.List.TaskController;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.Cacheable;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.*;

import com.KF48.ToDo.List.TaskModel.Task;
import com.KF48.ToDo.List.TaskService.TaskServiceDAO;
import jakarta.persistence.TableGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class TaskController {
    @Autowired
    private TaskServiceDAO taskServiceDAO;
    public TaskController(TaskServiceDAO taskServiceDAO){
        this.taskServiceDAO = taskServiceDAO;
    }
    @Tag(name = "Get All Task")
     // this caches the result
    @GetMapping("/getAll")

    public List<Task> getAllTask(){
        return taskServiceDAO.getAllTask();
    }
    @Tag(name = "Get Tsk By id")

    @GetMapping("/gettask/{id}")
    public Task getTaskById(@PathVariable Long id){
        return taskServiceDAO.getTaskById(id);
    }
    @Tag(name = "Create a new Task")
    @CacheEvict(value = {"allTasks", "taskById"}, allEntries = true)
    @PostMapping("/createTask")
    public Task createTask(@RequestBody Task task){
        return taskServiceDAO.createTask(task);
    }
    @Tag(name = "Update a Task")
    @CacheEvict(value = {"allTasks", "taskById"}, allEntries = true)
    @PutMapping("/updateTask/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task){
        return taskServiceDAO.updateTask(id, task);
    }
    @Tag(name = "Delete a task")
    @CacheEvict(value = {"allTasks", "taskById"}, allEntries = true)
    @DeleteMapping("/deleteTask/{id}")
    public void deleteTask(@PathVariable Long id){
        taskServiceDAO.deleteTask(id);
    }




}
