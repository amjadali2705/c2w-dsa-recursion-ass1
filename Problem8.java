class CountOccurence {

    //loop
    // static int getCount(int num, int digit) {
    //     int count = 0;
    //     while(num != 0) {
    //         if(digit == num%10)
    //             count++;

    //         num /= 10;
    //     }
    //     return count;
    // }


    //recursion
    static int getCount(int num, int digit) {
        if(num == 0)
            return 0;

        if(digit == num%10)
            return 1 + getCount(num/10, digit);

        return getCount(num/10, digit);
    }

    public static void main(String[] args) {
        System.out.println(getCount(12569645, 6));
    }
}