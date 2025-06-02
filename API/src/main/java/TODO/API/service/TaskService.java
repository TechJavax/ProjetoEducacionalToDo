package TODO.API.service;

import TODO.API.repository.TaskRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    /**Para revizar a implementação**/
    public List<Task> findTask(Boolean task) {
        return taskRepository.findByCompleted(task);
    }

    public List<Task> findAllTasks(Task task) {
        return taskRepository.findAll();
    }

    public void deleteTask(Long id) {
        this.taskRepository.deleteById(id);
    }

    public void deleteAllTasks() {
        this.taskRepository.deleteAll();
    }
}
