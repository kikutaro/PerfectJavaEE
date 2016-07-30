package perfect.javaee.phase;

import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *
 * @author kikuta
 */
public class CheckPhaseListener implements PhaseListener{

    @Override
    public void beforePhase(PhaseEvent event) {
        //フェーズの前に呼び出されます
        System.out.println("before:" + event.getPhaseId());
    }
    
    @Override
    public void afterPhase(PhaseEvent event) {
        //フェーズの後に呼び出されます
        System.out.println("after:" + event.getPhaseId());
        
        //リスト9.58　サブミットされた値の確認
        checkSubmitValue(event);
        
        //リスト9.60　管理Beanの変数を確認する
        String value = FacesContext.getCurrentInstance().getApplication().evaluateExpressionGet(FacesContext.getCurrentInstance(), "#{checkTargetBean.value}", String.class);
        System.out.println(value);
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
    
    private void checkSubmitValue(PhaseEvent event){
        FacesContext faces = event.getFacesContext();
        UIViewRoot viewRoot = faces.getViewRoot();
        if(viewRoot != null){
            UIComponent comp = viewRoot.findComponent("frm:txt");
            if(comp != null && comp instanceof UIInput){
                Object value = ((UIInput)comp).getValue();
                if(value == null){
                    System.out.println("null");
                }else{
                    System.out.println(value);
                }
            }
        }
    }
}
