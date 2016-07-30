package perfect.javaee.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 * 9-3-1 @RequestScoped サンプル用管理Bean.
 * @author kikuta
 */
@Named(value = "requestCounter")
@RequestScoped
public class RequestCounter {

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
}
