public class Calculator {

    public static void add_number(int inp1, int inp2) {
        int result;
        result=inp1+inp2;
        System.out.println(result);
    }

    public static int sub_numbers(int inp1, int inp2) {
        int result;
        result=inp1-inp2;
        return result;
    }

    public static int multiply_numbers(int inp1, int inp2) {
        int result;
        result=inp1*inp2;
        return result;
    }

    public static int division_numbers(int inp1, int inp2) {
        int result;
        result=inp1/inp2;
        return result;
    }

    public static void main(String [] args ){
        int returnvalue;
        add_number(1,2);
        System.out.println("result of substraction is "+sub_numbers(2,2));
        System.out.println("result of Multiplication is "+multiply_numbers(2,2));
        System.out.println("result of Division is "+division_numbers(2,2));

    }
}
