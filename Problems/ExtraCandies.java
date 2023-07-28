import java.util.Arrays;
import java.util.List;

public class ExtraCandies {
    public static void main(String[] args) {
        int [] candies={2,3,5,7};
        List<Boolean> result= kidsWithCandies(candies,5);
        System.out.println(result);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Boolean [] result= new Boolean[candies.length];
        int mostCandies=candies[0];

        for(int i=0; i<candies.length; i++){
            if(candies[i]+ extraCandies > mostCandies){
            mostCandies= candies[i];
            result[i]=true;
            }
            else{
                result[i]=false;
            }
        }
        return Arrays.asList(result);
    }
}
