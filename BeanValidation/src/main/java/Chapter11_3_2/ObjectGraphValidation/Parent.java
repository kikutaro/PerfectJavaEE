package Chapter11_3_2.ObjectGraphValidation;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

/**
 * リスト11.36　参照元オブジェクトのParentクラス.
 * @author kikuta
 */
public class Parent {
    @Valid //@Validを宣言しない場合はバリデーションエラーとならない
    private List<Child> children;
    
    public Parent() {
        children = new ArrayList<>();
    }
    public void createChildren() {
        children.add(new Child(30));
    }
}
