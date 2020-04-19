public class Palindrome {
    public static void main(String[] args) {
        String s = "murdrum";
        for(int i=0;i<=s.length()/2-1;)
        {
            for(int j=s.length()-1;j>=s.length()/2;j--)
            {
                if(s.charAt(i) != s.charAt(j))
                {
                    System.out.println("No");
                    return;
                }
                i++;
            }
        }
        System.out.println("YES");
    }
}
