class Rectangle{
    double len,bre;
    void calculate(){
        double area=len*bre;
        double perimeter=2*(len+bre);
    }
    public static void main(String[] args)
    {
        Rectangle obj=new Rectangle();
        obj.len=10;
        obj.bre=8;
        obj.calculate();
    }
}
