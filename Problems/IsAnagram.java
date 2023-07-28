public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        boolean isanagram=false;
        if(s.length()!=t.length())
        return false;
        else{
            int sums=0;
            int sumt=0;
            for(int i=0; i<s.length();i++){
                sums+=s.charAt(i);
            }
             for(int j=0; j<t.length();j++){
                sumt+=t.charAt(j);
            }
            isanagram=sums==sumt?true:false;
        }
        return isanagram;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("ANAGRAM","GRATAAN"));
        
    }
}
