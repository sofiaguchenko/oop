import java.util.ArrayList;

public class Slovs extends ChlenyPredlozh {
    private ArrayList<Bucvs> bucvs;
    static Slovs longestPalindrome = new Slovs("");

    public Slovs(String s) {
        bucvs = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            bucvs.add(new Bucvs(s.charAt(i)));
        }
    }


    public boolean checker() {
        ArrayList<Bucvs> tempCopy = new ArrayList<>(bucvs);
        tempCopy.remove(new Bucvs(' '));
        int temp = tempCopy.size() / 2;
        for (int i = 0; i < temp;i++ ){
            if (tempCopy.get(i).equals(tempCopy.get(tempCopy.size()-i-1))){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
    public void isLongestPalindrome(){
        ArrayList<Bucvs> tempCopy = new ArrayList<>(bucvs);
        tempCopy.remove(new Bucvs(' '));
        if (this.checker()){
            if (tempCopy.size() > longestPalindrome.bucvs.size()){
                longestPalindrome = this;

            }
        }
    }


    @Override
    public String toString() {
//        return letters.toString();
        StringBuilder sb = new StringBuilder();

        for (Bucvs letter : bucvs) {
            sb.append(letter.toString());
        }
        return sb.toString();
    }
}
