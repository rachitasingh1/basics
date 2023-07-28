public class InitBlock {
    String name;
    String book;
    String favSong;
    static int pages;

    {
        name = "Maya";
        book = "ALice in Wonderland";
        favSong = "Paradise";
        System.out.println("inside init! ");
        System.out.println(this);
        pages=55;
        System.out.println("pages are "+ pages);


    }
    {
        System.out.println("inside the second init! ");

    }

    InitBlock(String book) {
        this();
        System.out.println("inside param constructor! ");
        this.book = book;
    }

    InitBlock() {
        System.out.println("inside default constructor! ");
        this.book = "Far From the Maddening Crowd";
    }

    public static void main(String... s) {
        InitBlock ib = new InitBlock("Stranger");
        // InitBlock ib = new InitBlock();
        System.out.println(ib.name);
        System.out.println(ib.book);
        System.out.println(ib.favSong);
    }

    {
        System.out.println("inside the last init! ");

    }
}
