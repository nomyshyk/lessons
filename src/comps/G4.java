package comps;

public class G4 {
    public static void main(String[] args) {
        Compute c = new Compute(500, Model.DELL);
        Compute a = new Compute(550, Model.ACER);

        //System.out.println(c.model);

        for (Model m: Model.values()) {
            System.out.println(m.ordinal() + " " + m);
        }
    }
}
