package PredicateFunctionsConsumerSupplier;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> checkLength = samplestr -> samplestr.length()>5;
        System.out.println(checkLength.test("Hey")); 

        Predicate<String> checkEvenLength = samplestr -> samplestr.length()%2==0;
        System.out.println(checkLength.and(checkEvenLength).test("random")); 
        System.out.println(checkLength.or(checkEvenLength).test("something")); 
        System.out.println(checkLength.negate().test("random")); 

    }
}





