import java.util.List;

public class Paev {
    public String kuupaev;
    public List<Tund> tundideNimekiri;

    @Override
    public String toString() {
        return "Paev: " +
                "\nkuupaev: " + kuupaev +
                "\nTunnid: " + tundideNimekiri +
                "\n"
                ;
    }
}  