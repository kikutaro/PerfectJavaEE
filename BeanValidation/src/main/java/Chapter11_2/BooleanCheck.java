package Chapter11_2;

import javax.validation.constraints.AssertTrue;

/**
 * リスト11.6　@AssertFalse、@AssertTrueの利用例.
 * 
 * @author kikuta
 */
public class BooleanCheck {
    
    @AssertTrue
    public boolean turnOnStateActivated() {
        return false;
    }
}
