public class DiamondProblemSoln implements FuncInterfaceDiamondProb1, FuncInterfaceDiamondProb2 {

    @Override
    public void printThis() {
        FuncInterfaceDiamondProb1.super.printThis();
    }

    public static void main(String[] args) {
        DiamondProblemSoln solution = new DiamondProblemSoln();
        solution.printThis();
    }
}
