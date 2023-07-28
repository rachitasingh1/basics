public class DefaultConstructor {
    int age;
    String name;
    DefaultConstructor(){
        name="Rachita";
        age=11;
    }

    public static void main(String... s){
        DefaultConstructor dc = new DefaultConstructor();
        System.out.println(dc.age);
        System.out.println(dc.name);

    }
}
