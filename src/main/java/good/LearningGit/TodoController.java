package good.LearningGit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/")
    public String HelloTodo() {
        return "To-do Application !";
    }
}
