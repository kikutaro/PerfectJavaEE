package perfect.javaee.component.basic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.PostConstruct;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 * 9-2-2 UIComponentクラス サンプル用管理Bean.
 * 
 * リスト9.18　コンポーネントツリーを表示する
 * 
 * @author kikuta
 */
@Named(value = "componentTreeBean")
@ViewScoped
public class ComponentTreeBean implements Serializable {
    
    //TodoAppと同じ

    private String todo;
    
    private List<String> listTodo;
    
    @PostConstruct
    public void init() {
        listTodo = new ArrayList<>();
        
        //コンポーネントツリーを取得してクラス名を表示
        UIViewRoot root = FacesContext.getCurrentInstance().getViewRoot();
        System.out.println(root.getClass().getName());
    }
    
    private void viewTree(List<UIComponent> children, int depth) {
        children.stream().forEach(c -> {
            //ツリーの深さに合わせて「-」を加えて、コンポーネントのクラス名を表示する
            System.out.println(Stream.generate(() -> "-").limit(depth).collect(Collectors.joining()) + c.getClass().getName());
            
            if(c.getChildCount() > 0) {
                //配下にコンポーネントがあればviewTreeを再帰呼出し
                viewTree(c.getChildren(), depth + 1);
            }
        });
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
