public class Main {
    public static void main(String [] args){
        numberAdder numberAdder = (first,  last)-> {
            int sum = 0;
            for(int i = first; i <= last; i++){
                sum += i;
            }
            return sum;
        };
        int result = numberAdder.numberAdder(1, 3);
        System.out.println(result);

    
    }
    
    
    
}
