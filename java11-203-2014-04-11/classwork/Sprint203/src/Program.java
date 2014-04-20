import java.util.Date;

/**
 * Created by ma on 11.04.14.
 */
public class Program {
    private String sourceCode;

    public void addDate() {
        sourceCode += "//" + new Date() + " " + this.toString();
    }

    public String show() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }
}
