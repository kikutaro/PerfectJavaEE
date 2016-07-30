package perfect.javaee.component.basic;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.servlet.http.Part;
import lombok.Getter;
import lombok.Setter;

/**
 * 9-2-1 HTMLタグライブラリ サンプル用管理Bean.
 * 
 * リスト9.14　ファイルのアップロード
 * リスト9.15　ファイルアップロードの管理Bean
 * 
 * @author kikuta
 */
@Named(value = "uploadBean")
@RequestScoped
public class UploadBean {

    @Getter @Setter
    private Part part;
    
    public void upload() {
        try (InputStream is = part.getInputStream()) {
            Files.copy(is, FileSystems.getDefault().getPath(part.getSubmittedFileName()));
        } catch (IOException ex) {
            //例外処理
        }
    }
}
