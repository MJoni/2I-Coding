public class Runner {
    public static void main(String []args){
        int counter= 7;
        int until = 100;
        CodeIteration ci = new CodeIteration();
        while(counter<10){
            System.out.println("MULTIPLYING WITH "+counter+" >>");
            ci.printIterator(counter,until);
            counter++;
            until+=100;
        }
    }
}
