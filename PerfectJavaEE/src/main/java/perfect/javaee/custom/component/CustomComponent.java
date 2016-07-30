package perfect.javaee.custom.component;

import java.io.IOException;
import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

/**
 *
 * @author kikuta
 */
@FacesComponent(tagName = "cstComp", createTag = true, namespace = "http://perfectjava/component")
public class CustomComponent extends UIComponentBase {

    @Override
    public String getFamily() {
        return "custom.component";
    }

    @Override
    public void encodeBegin(FacesContext context) throws IOException {
        String value = (String)getAttributes().get("value");
        if(value != null) {
            ResponseWriter writer = context.getResponseWriter();
            writer.write(value + "自作コンポーネント");
        }
    }
}
