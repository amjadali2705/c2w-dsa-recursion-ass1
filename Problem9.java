class StringRev {

    //loop
    // static String reverse(String str) {
    //     String revStr = "";
    //     for(int i=str.length()-1; i>=0; i--) {
    //         revStr += str.charAt(i);
    //     }
    //     return revStr;
    // }


    //recursion
    static String reverse(String str) {
        if(str==null || str.length()<=1)
            return str;

        return reverse(str.substring(1)) + str.charAt(0);
    }
    
    public static void main(String[] args) {
        System.out.println(reverse("core2web"));
    }
}