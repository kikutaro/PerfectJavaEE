package perfect.javaee.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author kikuta
 */
@FacesValidator(value = "customValidator")
public class CustomValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        if(value != null && !value.toString().contains("perfect")) {
            throw new ValidatorException(new FacesMessage("pefectという文字を含む必要があります。"));
        }
    }
    
}
