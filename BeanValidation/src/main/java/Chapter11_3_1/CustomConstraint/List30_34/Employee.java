package Chapter11_3_1.CustomConstraint.List30_34;

import static Chapter11_3_1.CustomConstraint.List30_34.CheckMode.HARD;

/**
 * リスト11.33 アノテーションでCheckModeを指定.
 * 
 * @author kikuta
 */
@CheckEmployeeRank(value = HARD)
public class Employee {
    
    private Role role;
    private int rank;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    
}
