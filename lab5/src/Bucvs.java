public class Bucvs {
    private char bucva;

    public Bucvs (char bucva){
        this.bucva = bucva;
    }

    @Override
    public String toString() {
        return String.valueOf(bucva);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bucvs) {
            return String.valueOf(bucva).equalsIgnoreCase(String.valueOf(obj));
        }
        return false;
    }
}
