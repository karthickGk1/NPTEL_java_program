class circle{
    double k,l;
    double r;

    double circumfrence(){
        return 2*3.14*r;

    }

    double radius(){
        return (22/7)*r*r;
    }
}
class karthick{
    public static void main(String[] args){
        circle lav = new circle();
        lav.k=1.0;
        lav.l=3.4;
        lav.r=3.2;
        System.out.println("the circumfrence value is :" + lav.circumfrence() );
        System.out.println("the radius value is : " + lav.radius() );
    }
}