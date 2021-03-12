public class CodeIteration {
    public void printIterator(int num, int until){
        for (int i=1; i<=until;i++){
            System.out.format("Multiple of %d and %d : %d \n", num, i, num*i);
        }
    }
}
