class ReverseNumber {
    int num;
    void reverse(){
        int rev = 0;
        int temp = num;
        while(temp!=0){
            rev = rev * 10 + temp % 10;
            temp /=10;
        }
        System.out.println("Reversed Number = " + rev);
    }
    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber();
        obj.num = 98765;
        obj.reverse();
    }
}
