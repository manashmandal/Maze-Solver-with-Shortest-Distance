
package hellofuckingworld;



class Hellofuckingworld
{
   static boolean checkChar(char[] incoming){
       
        String right = "LBLBL";
        String incomingString = new String(incoming);
        
        System.out.println("Print string: " + right);  // Debugging purpose
        System.out.print("Print char: ");
        System.out.println (right);
        System.out.print("Print incoming: ");
        System.out.println(incoming);
        
        return (incomingString == null ? right == null : incomingString.equals(right));
    }
    
    
    public static void main(String[] args){
        String direction = "LLBLBLLBLBL";
        String right = "LBLBL";
        char rightArray[] = right.toCharArray();
        char arrayDir[] = direction.toCharArray();
        char calcDir[] = new char[direction.length()];
        char correctDir[] = new char[direction.length()];
        int i = 1;
        int k = 1;
        int j = 1;
        
        if (direction.length() > 0){
        
        if (arrayDir[0] != arrayDir[1]){
            calcDir[0] = arrayDir[0];
            k--;
        }
        
        if (arrayDir[0] == arrayDir[1]){
            correctDir[0] = arrayDir[0];
            j--;
        }
        
    }
        while (i <= direction.length()){
            if (i+1 >= direction.length() || i-1 < 0) break;
            
            if (arrayDir[i] != arrayDir[i+1]
                    || ( (arrayDir[i] != arrayDir[i-1])   && (arrayDir[i] == arrayDir[i+1]))
                    ){
                calcDir[j] = arrayDir[i];
                j++;
                i++;
            }
            
            if (i+1 >= direction.length() || i-1 < 0) break;
            
            if (arrayDir[i] == arrayDir[i+1]
                    
                    && !( (arrayDir[i] != arrayDir[i-1])   && (arrayDir[i] == arrayDir[i+1]))
                    
                    
                    ){
                correctDir[k] = arrayDir[i];
                i++;
                k++;
            }
            
            
           
            boolean x = checkChar(calcDir);
            
            System.out.print ("Printing boolean: ");
            System.out.println(x);
            
        }
        
        if (arrayDir[direction.length() - 1] != arrayDir[direction.length() - 2]){
                calcDir[j] = arrayDir[direction.length() - 1];
        }
        
        if (arrayDir[direction.length() - 1] == arrayDir[direction.length() - 2]){
                correctDir[k] = arrayDir[direction.length() -1 ];
        }
        
        
        
        
        System.out.println(correctDir);
        System.out.println(calcDir);
        
        
    }
}
