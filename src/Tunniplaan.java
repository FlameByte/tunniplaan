import java.util.List;
import java.util.Map;

public class Tunniplaan {
    public String nadal;
    public Map<String, List<Tund>> tunnid;

    @Override
    public String toString() {
        return "Tunniplaan:" +
                "\nnadal:\n" + nadal +
                "\ntunnid:\n" + tunnid
                ;
    }
} 