package Chapter11_3_3.ConstraintComposition;

//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Pattern;
//import javax.validation.constraints.Size;

/**
 * リスト11.38　複数のアノテーションがある場合(コメントアウト)
 * リスト11.40　Constraint Compositionを適用した場合.
 * 
 * @author kikuta
 */
public class User {
//    @NotNull
//    @Size(min = 8, max = 16)
//    @Pattern(regexp = ".*[!-/]+.*")
    @CheckPassword
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
