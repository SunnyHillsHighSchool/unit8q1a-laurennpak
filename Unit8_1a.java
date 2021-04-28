//Name: Lauren Pak
//Period: 1
//Date: 4/27/21
public class Unit8_1a
{
  public int [] [] modifyColumns (int [] [] arr)
 { 
   for(int r = 0; r < arr.length; r++)
{
     for(int c = 0; c < arr[0].length; c++)
     {
          if(c % 2 != 0)
          {
               arr[r][c] = arr[r][c-1];
          }
     }
}
return arr;
      }
    }
 