package perfect.javaee.converter;

import java.io.Serializable;
import java.util.Date;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 * 10-2-1 標準コンバータ サンプル用管理Bean.
 * 
 * リスト10.7　JSFによるコンバート
 * リスト10.8　リスト10.7の管理Bean
 * リスト10.9　ConvertNumberとConvertDateTimeの利用例
 * 
 * @author kikuta
 */
@Named(value = "converterBean")
@ViewScoped
public class ConverterBean implements Serializable {
    
    private int intVal;
    
    private Integer integerVal;
    
    private int percent;
    
    private int yen;
    
    private Date date;
    
    public void out() {
        System.out.println("intVal = " + intVal);
        System.out.println("integerVal = " + integerVal);
        System.out.println("percent = " + percent);
        System.out.println("yen = " + yen);
        System.out.println("date = " + date);
    }

    public int getIntVal() {
        return intVal;
    }

    public void setIntVal(int intVal) {
        this.intVal = intVal;
    }

    public Integer getIntegerVal() {
        return integerVal;
    }

    public void setIntegerVal(Integer integerVal) {
        this.integerVal = integerVal;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public int getYen() {
        return yen;
    }

    public void setYen(int yen) {
        this.yen = yen;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
