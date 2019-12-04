class problem_5 
{
  public static void main(String[] args) 
  {
    int arr[] = {0,1,-2,3,4,5,-27,9,0,0};
    int[] temp = new int[arr.length]; 
    int c = 0;
    
    for(int i = 0; i < arr.length;i++)
    {
      if(arr[i] != 0)
	  {
        temp[c] = arr[i];
        c++;
      }
        
    }
    
    display(temp);
    
    
  }
  public static void display(int[] temp)
  {
    for(int i = 0;i < temp.length;i++)
      System.out.println(temp[i]);
  }
}
