class SumDigits {

    //loop
    // static int getSum(int num) {
    //     int sum = 0;
    //     while(num != 0) {
    //         sum += num%10;
    //         num /= 10;
    //     }
    //     return sum;
    // }


    //recursion
    static int getSum(int num) {
        if(num/10 == 0) 
            return num;

        return getSum(num/10) + num%10;
    }

    public static void main(String[] args) {
        System.out.println(getSum(12356));
    }
}