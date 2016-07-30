package perfect.javaee.scope;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;
import javax.inject.Named;

@Named
@Dependent
public class FlowCounterDefinition {
    
    private static final String flowId = "counterFlow";

    @Produces
    @FlowDefinition
    public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
        flowBuilder.id("", flowId);

        //フローに入って最初に呼び出される処理を指定
        flowBuilder.initializer("#{flowCounter.init()}");

        //フローの最初のノードを設定
        flowBuilder.viewNode(flowId, "/flow/firstFlow.xhtml").markAsStartNode();

        //その他のノードを設定
        flowBuilder.viewNode("second", "/flow/secondFlow.xhtml");
        flowBuilder.viewNode("third", "/flow/thirdFlow.xhtml");
        
        //他のフローへの切り替え
        flowBuilder.flowCallNode("another").flowReference("", "anotherFlow");

        //フローを終了するノードを設定
        flowBuilder.returnNode("return").fromOutcome("/flow/flowEntry.xhtml");

        //フローが終了するときに呼び出される処理を指定
        flowBuilder.finalizer("#{flowCounter.fin()}");
        return flowBuilder.getFlow();
    }
}
