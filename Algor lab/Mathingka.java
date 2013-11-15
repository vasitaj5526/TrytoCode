public class Mathingka{
  
  public static void main(String[]args){
    
    char Text[] = {'A','B','C','D','E','F','G'};
    char Pattern[]  = {'A','B','C'};
    int Result = -1;
    
    for(int i = 0; i<(Text.length - Pattern.length)+1 ;i++){
      int j = 0;
      
      while( j<Pattern.length && Pattern[j] == Text[i+j]){
        j = j+1;
      }
    
      if (j == Pattern.length){
        Result = i; break;
      }
      else{
        Result = -1;
      }
      }
      
    if(Result >= 0 && Result<= Text.length){
      System.out.println("the Pattern found from : "+ (Result+1)+"to "+ (Result+Pattern.length));
    }
    else{
      System.out.println("Not found");
    }
  }
    }
  
