class SumOfN {
    
    //loop
    // static int printSum(int n) {
    //     int sum = 0;
    //     for(int i=1; i<=n; i++) {
    //         sum += i;
    //     }
    //     return sum;
    // }

    //recursion
    static int printSum(int n) {
        if(n == 1)
            return n;

        return n + printSum(n-1);
    }

    public static void main(String[] args) {
        System.out.println(printSum(10));
    }
}