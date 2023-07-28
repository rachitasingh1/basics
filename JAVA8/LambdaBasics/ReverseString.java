public class ReverseString {
    public static void main(String[] args) {
        String sample = "Rachita";
        String reversed = "";

        // char[] samplearray= new samplearray[sample.length];
        for (int i = sample.length() - 1; i >= 0; i--) {
            reversed += sample.charAt(i);
        }

        System.out.println("Original String: " + sample);
        System.out.println("Reversed String is: " + reversed);
        System.out.println("Another way to reverse:" +sample);
        
    }
}
