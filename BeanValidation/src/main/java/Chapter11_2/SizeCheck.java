package Chapter11_2;

import java.util.List;
import javax.validation.constraints.Size;

/**
 * リスト11.7　@Sizeの利用例.
 * 
 * @author kikuta
 */
public class SizeCheck {
    
    @Size(min = 8, max = 16)
    private String str;
    
    @Size(min = 3)
    private List<String> listSrr;
    
    @Size(min = 3)
    private String[] arrStr;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public List<String> getListSrr() {
        return listSrr;
    }

    public void setListSrr(List<String> listSrr) {
        this.listSrr = listSrr;
    }

    public String[] getArrStr() {
        return arrStr;
    }

    public void setArrStr(String[] arrStr) {
        this.arrStr = arrStr;
    }
    
    
}
