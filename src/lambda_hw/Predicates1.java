package lambda_hw;

public class Predicates1 {
    public static void main(String[] args) {
        TwoStringPredicate twoStringPredicate;
        String string1="Anton";
        String string2="Yaroslav";
        String longer = betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
        String first = betterString(string1, string2, (s1, s2) -> true);
        System.out.println("Longer: "+longer);
        System.out.println("First: "+first);
    }

    static String betterString(String string1, String string2, TwoStringPredicate twoStringPredicate){
        if (twoStringPredicate.test(string1,string2)){
            return string1;
        }
        return string2;
    }
}

interface TwoStringPredicate{
    boolean test(String string1, String string2);
}
