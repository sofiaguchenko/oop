public class Tex {
    private Predlozhens[] predlozhens;

    public Tex(String pred) {
        String[] split = pred.split("\n");
        predlozhens = new Predlozhens[split.length];
        for (int i = 0; i < split.length; i++) {
            predlozhens[i] = new Predlozhens(split[i]);
        }
    }
    public Slovs findLongestPalindrome() {
        for (Predlozhens predlozhen : predlozhens) {
            predlozhen.findLongestPalindrome();
        }
        return Slovs.longestPalindrome;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Predlozhens predlozhen : predlozhens) {
            sb.append(predlozhen.toString());

        }
        return sb.toString();
    }
}
