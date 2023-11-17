class CheckPrime {

    //loop
    // static boolean isPrime(int num) {
    //     for(int i=2; i<=num/2; i++) {
    //         if(num%i == 0) 
    //             return false;
    //     }
    //     return true;
    // }


    //recursion
    static boolean isPrime(int num, int i) {
        if(num <= 2) 
            return (num==2) ? true : false;
        
        if(num%i == 0)
            return false;

        if(i*i > num)
            return true;

        return isPrime(num, i+1);
    }
    
    public static void main(String[] args) {
        System.out.println(isPrime(97, 2));
    }
}