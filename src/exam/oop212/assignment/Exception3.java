class WifiLANNode {
    private static double upper_limit = 1500; // Declaring a static variable for global upper limit.
    double usedMB;
    public WifiLANNode(double usedMB) throws BandwidthLimitExceeded, InvalidAmountArgument {
        if(usedMB<0){
            throw new InvalidAmountArgument(); // Throwing exception when the value is negative.
        }
        if(usedMB>upper_limit){
            throw new BandwidthLimitExceeded(usedMB,upper_limit); // Throwing exception when the value is //greater than upper limit
        }
        this.usedMB = usedMB; // If none of the exception is generated, then set the value of usedMb
    }
    public void downloadFile(double amount) throws BandwidthLimitExceeded, InvalidAmountArgument {
        if(amount<0){
            throw new InvalidAmountArgument(); // Throwing exception when the value of the amount is negative.
        }
        if((usedMB+amount)>upper_limit){
            throw new BandwidthLimitExceeded(usedMB+amount,upper_limit); // Throwing exception when the //value of usedMB is tried to set beyond upper limit.
        }
        usedMB += amount; // If none of the exception is generated, then increase the value of usedMb
    }
    public static void increaseGlobalLimit(double increase_upper_limit){
        upper_limit += increase_upper_limit; // increase the value of static variable which is used as upper limit //for all the object
    }
}
class BandwidthLimitExceeded extends Exception{ // creating custom exception for BandwidthLimitExceeded
    public BandwidthLimitExceeded(double requested_size,double upper_limit){
        super("You requested to use "+requested_size+"MB"+" which crosses the current maximum limit of "+upper_limit+"MB.");
    }
}
class InvalidAmountArgument extends Exception{ // creating custom exception for InvalidAmountArgument
    InvalidAmountArgument(){
        super("Please input positive value.");
    }
}
public class Exception3{
    public static void main(String[] args) {
        try {
            WifiLANNode obj1 = new WifiLANNode(1510); // BandwidthLimitExceeded exception will be thrown //as the value passed is greater than the upper limit.
        }
        catch (BandwidthLimitExceeded | InvalidAmountArgument e) { // Catch the exception that was thrown
            System.out.println(e.getMessage()); // Printing the message that was passed in Exception using super //keyword
        }
        try {
            WifiLANNode.increaseGlobalLimit(1000); // increase upper limit for all the objects | Now upper limit //for all the objects are 1500+1000 = 2500
            WifiLANNode obj2 = new WifiLANNode(1800);
            obj2.downloadFile(1200); // BandwidthLimitExceeded exception will be thrown as the value usedMB //will be tried to set beyond upper limit.
        }
        catch (BandwidthLimitExceeded | InvalidAmountArgument e) { // Catch the exception that was thrown
            System.out.println(e.getMessage()); // Printing the message that was passed in Exception using super //keyword
        }
        try {
            WifiLANNode obj3 = new WifiLANNode(-1000); // InvalidAmountArgument exception will be thrown
//as the value of the parameter is negative.
        }
        catch (BandwidthLimitExceeded | InvalidAmountArgument e) { // Catch the exception that was thrown
            System.out.println(e.getMessage()); //Printing the message that was passed in Exception using super keyword
        }
    }
}