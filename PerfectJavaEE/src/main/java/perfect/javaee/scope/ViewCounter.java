package perfect.javaee.scope;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 * 9-3-2 @ViewScoped、@SessionScoped、@ApplicationScoped サンプル用管理Bean.
 * @author kikuta
 */
@Named(value = "viewCounter")
@ViewScoped
//@SessionScoped
//@ApplicationScoped
public class ViewCounter implements Serializable {

    private int count;
    
    @PostConstruct
    private void init() {
        System.out.println("CDI管理Beanの初期化");
        count = 0;
    }

    @PreDestroy
    private void fin() {
        System.out.println("CDI管理Beanの破棄");
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
    
    //@ViewScopedを確認するためにページ遷移するメソッドを定義
    public String move() {
        return "next.xhtml";
    }
}
