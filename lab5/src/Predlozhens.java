public class Predlozhens {
    private static final String rozdilovy = ",.!?()";
    private ChlenyPredlozh[] chlenyPredlozhs;

    public Predlozhens(String pred){
        pred = pred.replaceAll(" +", " ");
        String[] split = pred.split("(?=[,.!?() ])|\\s");
        chlenyPredlozhs = new ChlenyPredlozh[split.length];
        for (int i = 0; i < split.length; i++) {
            if (rozdilovy.contains(split[i])) {
                chlenyPredlozhs[i] = new Rozznaks(split[i]);
            } else {
                chlenyPredlozhs[i] = new Slovs(split[i]);
            }
        }
    }
    public void findLongestPalindrome() {
        for (ChlenyPredlozh chlenyPredlozhs : chlenyPredlozhs) {
            if (chlenyPredlozhs instanceof Slovs) ((Slovs) chlenyPredlozhs).isLongestPalindrome();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (ChlenyPredlozh chlenyPredlozhs : chlenyPredlozhs) {
            sb.append(chlenyPredlozhs.toString());
        }
        return sb.toString();
    }
}
