package Chapter11_3_1.CustomConstraint.List25_29;

/**
 * リスト11.25　ロールとランクを持つ社員クラス.
 * 
 * @author kikuta
 */
@CheckEmployeeRank
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
