package perfect.javaee.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import perfect.javaee.component.basic.Employee;

/**
 * 10-2-2 カスタムコンバータ サンプル用管理Bean.
 * 
 * リスト10.10　カスタムコンバータの定義
 * リスト10.11　カスタムコンバータの利用
 * 
 * @author kikuta
 */
@FacesConverter(value = "customConverter")
public class CustomConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return new Employee(value);
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value != null && value instanceof Employee) {
            return ((Employee)value).getName();
        }
        return "";
    }
    
}
