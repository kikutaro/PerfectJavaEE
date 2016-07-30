package perfect.javaee.component.basic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 9-2-1 HTMLタグライブラリ サンプル用Itemクラス.
 * 
 * リスト9.10　選択項目を表すItemクラス
 * 
 * @author kikuta 
 */
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    private String label;
    private String value;
}
