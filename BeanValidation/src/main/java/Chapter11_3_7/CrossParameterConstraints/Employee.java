package Chapter11_3_7.CrossParameterConstraints;

import java.util.Date;

/**
 * リスト11.51　メソッドの 引数で指定した2つの日付の関係を検証する.
 * 
 * @author kikuta
 */
public class Employee {
    
    private Date orientationStart;
    private Date orientationEnd;
    
    @DateParameters
    public void joinCompany(Date orientationStart, Date orientationEnd) {
        
    }
}
