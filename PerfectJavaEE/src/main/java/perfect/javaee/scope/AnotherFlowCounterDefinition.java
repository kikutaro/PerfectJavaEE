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
public class AnotherFlowCounterDefinition {
    
    private static final String flowId = "anotherFlow";
    
    @Produces
    @FlowDefinition
    public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder){
        flowBuilder.initializer("#{anotherFlowCounter.init()}");
        flowBuilder.id("", flowId);

        flowBuilder.viewNode(flowId, "/flow/anotherFlow.xhtml").markAsStartNode();
        
        flowBuilder.finalizer("#{anotherFlowCounter.fin()}");
        return flowBuilder.getFlow();
    }
}
