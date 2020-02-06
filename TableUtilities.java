 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String result = "";
        
        for(int i = 1; i <= 5; i++){
            for(int x = 1; x <= 5; x++){
                int nextNum = x * i;
                if (nextNum < 10){
                    result += "  " + nextNum + " |";
                }else if(nextNum < 100){
                    result += " " + nextNum + " |";
                }else {
                    result += nextNum + " |";
                }
              
            }
            result += "\n";
        }
        return result;
    }

    public static String getLargeMultiplicationTable() {
        String result = "";
        for(int i = 1; i <= 10; i++){
            for(int x = 1; x <= 10; x++){
                int nextNum = x * i;
                if (nextNum < 10){
                    result += "  " + nextNum + " |";
                }else if(nextNum < 100){
                    result += " " + nextNum + " |";
                }else {
                    result += nextNum + " |";
                }
              
            }
            result += "\n";
        }
        
        return result;
    }

    public static String getMultiplicationTable(int tableSize) {
        String result = "";
        for(int i = 1; i <= tableSize; i++){
            for(int x = 1; x <= tableSize; x++){
                int nextNum = x * i;
                if (nextNum < 10){
                    result += "  " + nextNum + " |";
                }else if(nextNum < 100){
                    result += " " + nextNum + " |";
                }else {
                    result += nextNum + " |";
                }
              
            }
            result += "\n";
        }
        
        return result;
    }
}
