public class Methods4 {

    static void main() {
    int ans1 = add(5, 10);
    int ans2 = add(10, 5 ,15);
        System.out.println("ans1 = " + ans1);
        System.out.println("ans2 = " + ans2);

    }

    static int add(int p, int q){
        int sum = p + q;
        return sum;
    }

    static int add(int P , int Q , int R) {
        int ans = P + Q + R;
        return ans;
    }
}
