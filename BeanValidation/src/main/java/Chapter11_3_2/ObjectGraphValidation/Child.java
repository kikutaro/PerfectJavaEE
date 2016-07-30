package Chapter11_3_2.ObjectGraphValidation;

import javax.validation.constraints.Max;

/**
 * リスト11.35　参照先オブジェクトのChildクラス.
 * 
 * @author kikuta
 */
public class Child {
    @Max(10)
    private int val;
    
    public Child(int val) {
        this.val = val;
    }
}
