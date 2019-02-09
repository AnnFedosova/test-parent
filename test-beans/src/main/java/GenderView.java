import javax.faces.bean.ManagedBean;

@ManagedBean
public class GenderView {

    private String console;

    //@PostConstruct //будет вызываться только один раз.

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }


}