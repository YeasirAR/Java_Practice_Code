class CelsiusFahrenheit {
    double celsius, fahrenheit;

    void fahrenheit() {
        fahrenheit = (9 * celsius + 160) / 5;
    }
}

public class temp {
    public static void main(String args[]) {
        CelsiusFahrenheit obj = new CelsiusFahrenheit();
        obj.celsius = 98.0;
        obj.fahrenheit();
        System.out.println(obj.fahrenheit);
    }
}