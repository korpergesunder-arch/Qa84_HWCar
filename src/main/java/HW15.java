public class HW15 {
    public static int parseAndSum2(String s1, String s2) {
        return Integer.parseInt(s1) + Integer.parseInt(s2);
    }
    public static int findSum(int[] ar, int index, String s){
        return ar[index] + Integer.parseInt(s);
    }
    public static void HW15(String[] args){
        System.out.println(parseAndSum2("-2", "6"));
        int[] ar = {9, -2, 7, 1};
        System.out.println(findSum(ar, 2, "6"));
    }
}

/*
                                HOMEWORK
     1.
     public static int parseAndSum2(String s1,String s2)
     s1 ->"-2"         s2-> "6"
           -2        +         6      = 4
           return 4;

      2.
      public static int findSum(int[] ar, int index, String s)
               0   1  2  3
       ar->   [9][-2][7][1]   index = 2      s=> "6"

               7 + 6 = 13
               return 13;

 */