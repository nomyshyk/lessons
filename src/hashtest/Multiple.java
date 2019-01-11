package hashtest;

public class Multiple {
    public Integer a;
    public Integer b;

    public Multiple(Integer a, Integer b){
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Multiple){
            int resultThis = this.a * this.b;
            int resultObj = ((Multiple) obj).a *
                    ((Multiple) obj).b;
            if(resultObj == resultThis){
                return true;
            }
        }
        return false;
    }
}
