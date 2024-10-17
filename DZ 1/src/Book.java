import java.util.ArrayList;
import java.util.List;
public class Book {
    private String nazvanie;
    private String avtor;
    private String isnb;
    private int Kolichestvo;

    public Book(String nazvanie,String avtor, String isnb,int Kolichestvo) {
        this.nazvanie = nazvanie;
        this.avtor = avtor;
        this.isnb = isnb;
        this.Kolichestvo = Kolichestvo;

    }
    public String getNazvanie() {
        return nazvanie;
    }
    public int getKolichestvo() {
        return Kolichestvo;
    }
    public void setKolichestvo(int kolichestvo) {
        this.Kolichestvo = kolichestvo;
    }

}

