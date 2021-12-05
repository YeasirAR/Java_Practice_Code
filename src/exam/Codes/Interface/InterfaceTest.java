package Codes.Interface;

interface Callback
{
    void callback(int param);
}

class Client implements Callback
{
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }
}

class SubClient extends Client
{

}

public class InterfaceTest {
    public static void main(String[] args) {
        SubClient subClient = new SubClient();
        subClient.callback(15);
        // Can't instantiate an interface directly
        //Callback c1 = new Callback();
        //c1.callback(21);
        Client c2 = new Client();
        c2.callback(42);
        // Accessing implementations through Interface reference
        Callback c3 = new Client();
        c3.callback(84);
    }
}
