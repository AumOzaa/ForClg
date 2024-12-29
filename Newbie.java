public class Newbie {
    public static void main(String[] args) {
        int n = 6;
        P(n,1,1);

    }
    public static void P(int n, int i, int j) {
        if(i==(n+1)) {
            return;
        }
        if (j == (i + 1)) {
            System.out.println();
            P(n,i+1,1);
        }else{
            System.out.print("* ");
            P(n,i,j+1);
        }
    }
}
