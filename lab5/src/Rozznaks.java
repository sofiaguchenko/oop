public class Rozznaks extends ChlenyPredlozh {
    private String znars;

    public Rozznaks(String symbols) {
        this.znars = symbols;
    }

    @Override
    public String toString() {
        return znars;
    }
}
