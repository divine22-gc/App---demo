public class Calculator 
{
    int num1 = 10;
    int num2 = 20;
    static void main(String[] args)
    {
        Calculator m = new Calculator();
        m.add();
        m.sub();
        m.mul();
        m.div();
    }
    void add()
    {
        int sum = 0;
        sum = num1+num2;
        System.out.println(sum);
    }

    void sub()
    {
        int dif = 0;
        dif = num2 - num1;
        System.out.println(dif);
    }

    void mul(){
        int pro = 0;
        pro = num1 * num2;
        System.out.println(pro);
    }

    void div(){
        int quo = 0;
        quo = num2/num1;
        System.out.println(quo);
    }
}
