//TODO: <name>
//TODO: <date>
//Practice 2015 - 02: Fury’s Graffiti

public class  {
  public static void main(String[] args) {
//Scanner
      Scanner in = new Scanner(System.in);
      //number of entries
      int entries = in.nextInt();
      in.nextLine();
      String word;
      //all the rounded letters and nums
      String rounded = "BCDGJOPQRSU2356890";
      
      //for loop for entries
      for(int i = 0; i<entries; i++)
      {
         word = in.nextLine();
         int wordLen = word.length();
         //used to check if all the letters are rounded
         int round = 0;
         for(int j = 0; j<wordLen;j++)
         {
            //checks if the letter is a rounded letter or not
            if(rounded.indexOf(word.charAt(j)) == -1)
            {
               System.out.println("NOT ROUNDED");
               j = wordLen-1;
            }
            else
            {
               round++;
            }
            if(round == wordLen)
            {
               System.out.println("ROUNDED");
            }
         
         }
      }      
    System.exit(0);
  }
}
