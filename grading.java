class Grade{
    public static void main(String[] args) {
        int percentage=85;
        if(percentage>=90)
            System.out.println("A");
        else if(percentage>=80)
            System.out.println("B");
        else if(percentage>=70)
            System.out.println("C");
        else if(percentage>=60)
            System.out.println("D");
        else if(percentage>=40)
            System.out.println("E");
        else
            System.out.println("Fail!");
    }
}
