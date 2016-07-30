/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfect.javaee.scope;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.flow.FlowScoped;

/**
 *
 * @author kikuta
 */
@Named(value = "anotherFlowCounter")
@FlowScoped("anotherFlow")
public class AnotherFlowCounter implements Serializable {

    public void init(){
        System.out.println("AnotherFlowCounterの管理Bean初期化");
    }
    
    public void fin(){
        System.out.println("AnotherFlowCounterの管理Bean破棄");
    }
}
