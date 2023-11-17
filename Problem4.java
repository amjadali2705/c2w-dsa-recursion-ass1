class DigitsLen {

    //loop
    // static int getLen(int num) {
    //     int count = 0;
    //     while(num != 0) {
    //         num/=10;
    //         count++;
    //     }
    //     return count;
    // }


    //recursion
    static int getLen(int num) {
        if(num/10 == 0)
            return 1;

        return getLen(num/10) + 1;
    }

    public static void main(String[] args) {
        System.out.println(getLen(567889));
    }
}