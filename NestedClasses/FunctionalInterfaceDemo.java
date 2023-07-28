public class FunctionalInterfaceDemo {

    @FunctionalInterface
    interface TheoryMarks {
        abstract float theoryMarks();
    }

    @FunctionalInterface
    interface PracticalMarks implements TheoryMarks {
        abstract float practicalMarks();

        public static void printMarks() {
            System.out.println("Calculation of marks");
        }
    }

    // public static void main(String[] args) {

    // }
}
