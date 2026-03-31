import java.lang.Math;

public class instance {
    public int instance_value;  // ? Instance Variable
    public static int count;

    public instance(int value)
    {
        instance_value = value;
        count++;
    }

    public instance(int value, int count)
    {
        instance_value = value;
        instance.count = count;
    }

    public void power(double pow)   // ? "pow" is not an instance variable, it's parameter
    {
        double result = Math.pow(instance_value, pow);  // ? "result" is also not an instance variable, it's local variable
        System.out.println(result);
    }

    public static void main(String[] args) {
        instance obj = new instance(10, 1);
        obj.power(4);

        obj = new instance(5);
        obj = new instance(3);

        System.out.println(instance.count); // * Will be '3'
    }
}
