


public class NumberUtilities {

    public static String getRange(int stop) {
        String holder = "0";
        
        for(int i = 1; i < stop; i++){
            String temp = "" + i;
            holder += temp;
        }
        
        return holder;
    }

    public static String getRange(int start, int stop) {
       String holder = "" + start;
       for(int i = start + 1; i < stop; i ++){
            String temp = "" + i;
            holder += temp;
       }
       return holder;
    }

    public static String getRange(int start, int stop, int step) {
        String holder = "";

        for(int i = start; i < stop; i += step){
            holder += i;
        }
      
        return holder;
    }

    public static String getEvenNumbers(int start, int stop) {
        String holder;
        int counter;
        if(start % 2 != 0){
            counter = start + 1;
            holder = "" + counter;
        } else {
            counter = start;
            holder = "" + start;
        }
        
        for (int i =  counter + 2; i < stop; i += 2){
            String temp = "" + i;
            holder = holder + temp;
        }
        
        return holder;
    }


    public static String getOddNumbers(int start, int stop) {
        String holder;
        int counter;
        if(start % 2 == 0){
            counter = start + 1;
            holder = "" + counter;
        } else {
            counter = start;
            holder = "" + start;
        }
        
        for (int i =  counter + 2; i < stop; i += 2){
            String temp = "" + i;
            holder = holder + temp;
        }
        
        return holder;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
       String holder =  "";
       int multiple = 1;
        for(int i = start; i <= stop; i++){
           multiple = 1;
            for(int x = 1; x <= exponent; x++){
                multiple *=i ;
      
            }
            
            holder += multiple;
        }
       return holder;
    }
    
}
