class PrintRevNo {

    //using loop
    // static void printRevNum(int num) {
    //     for(int i=num; i>=1; i--) {
    //         System.out.print(i+" ");
    //     }
    // }

    //recursion
    static void printRevNum(int num) {
        if(num == 0) {
            return;
        }
        System.out.print(num+" ");
        printRevNum(num-1);
    }
    
    public static void main(String[] args) {
        printRevNum(10);
    }
}