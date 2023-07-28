class FunctionOverloading{
    public static void main(String... s){
        FunctionOverloading fun = new FunctionOverloading();
        fun.display(10.0);
    }
    public void display(double a){
        System.out.println("double "+a);
    }
    public void display(byte b){
        System.out.println("byte "+b);
    }
    public void display(short c){
        System.out.println("short "+c);
    }
    public void display(long d){
        System.out.println("long "+d);
    }
    public void display(float d){
        System.out.println("float "+d);
    }
    public void display(char d){
        System.out.println("char "+d);
    }
}