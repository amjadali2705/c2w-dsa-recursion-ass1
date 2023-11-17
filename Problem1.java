class PrintNo {

    //using loop
    // static void printNum(int num) {
    //     for(int i=1; i<=num; i++) {
    //         System.out.print(i+" ");
    //     }
    // }

    //recursion
    static void printNum(int num) {
        if(num == 0) {
            return;
        }
        printNum(num-1);
        System.out.print(num+" ");
    }
    
    public static void main(String[] args) {
        printNum(10);
    }
}