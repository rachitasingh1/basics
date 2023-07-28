// public
// protected
// default
// private
// both must be static for overriding

public class Child1 extends Parent1 {
    public static void show() {
        System.out.println("Child1");
        //super.show();
        Parent1.show();
    }

    public static void main(String... t) {
        // Child1 child = new Child1();
        // child.show();
        try{
        Child1.show();
        }
        catch(IOException | SQLException | Exception ex){
            
           
       }
    }
}
