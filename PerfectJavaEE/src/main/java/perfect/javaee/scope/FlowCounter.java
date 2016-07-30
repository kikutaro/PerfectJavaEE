package perfect.javaee.scope;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.flow.FlowScoped;

@Named(value = "flowCounter")
@FlowScoped("counterFlow")
public class FlowCounter implements Serializable {

    private int count;

    public void init() {
        count = 0;
        System.out.println("FlowScopeの管理Bean初期化");
    }

    public void fin() {
        System.out.println("FlowScopeの管理Bean破棄");
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

}
