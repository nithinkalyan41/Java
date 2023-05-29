package tags;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;


public class PrintTableTag extends TagSupport {
    public int n;
    public void setN(int n){
        this.n=n;
    }
    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out = pageContext.getOut();
            out.print("<br>");
            for (int i = 0; i < n; i++) {
                out.println(i * n+"<br>");

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
}
