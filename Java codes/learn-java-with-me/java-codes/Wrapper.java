public class Wrapper {
    public static void main(String[] args){
        int a=10;
        String s="20";
        Integer obj=new Integer(s);
        System.out.println(obj);
        System.out.println();
        double d=Double.parseDouble(s);
        int i=Integer.parseInt(s);
        float f=Float.parseFloat(s);
    }
}
