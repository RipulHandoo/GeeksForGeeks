class GfG
{
	public static int palinArray(int[] a, int n)
   {
          //add code here.
      int flag = 1;
      for(int i = 0;i<n;i++) {
          int num_copy = a[i];
          int temp = 0;
          int reverse = 0;
          while(num_copy > 0) {
              temp = num_copy%10;
              reverse = reverse*10 + temp;
              num_copy = num_copy/10;
          }
          if(reverse != a[i]) {
              flag = 0;
              break;
          }
      }
      return flag;
   }
}
