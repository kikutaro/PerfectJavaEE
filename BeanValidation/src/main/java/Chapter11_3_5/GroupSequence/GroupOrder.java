package Chapter11_3_5.GroupSequence;

import javax.validation.GroupSequence;

/**
 * リスト11.48　@GroupSequenceによる実行順序の指定.
 * 
 * @author kikuta
 */
@GroupSequence({Group3.class, Group2.class, Group1.class})
public interface GroupOrder {
    
}
