package perfect.javaee.todoapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author kikuta
 */
@Named(value = "todoBean")
@ViewScoped
public class TodoBean implements Serializable {

    private String todo;
    
    private List<String> listTodo;
    
    @PostConstruct
    public void init() {
        listTodo = new ArrayList<>();
    }
    
    public void add() {
        listTodo.add(todo);
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public List<String> getListTodo() {
        return listTodo;
    }

    public void setListTodo(List<String> listTodo) {
        this.listTodo = listTodo;
    }
}
