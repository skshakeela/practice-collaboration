private interface operations{
public int sum(int n1,int n2);
public int product(int n1,int n2);
}

public class implements operations{
    public static void main(String [] args){
        operations o=new operations();
        public int sum(int n1,int n2){
        return n1+n2;
    }
    public int product(int n1,int n2){
        return n1*n2;
    }
    System.out.println(o.sum(7,5));
    System.out.println(o.product(54,76));
    }
}