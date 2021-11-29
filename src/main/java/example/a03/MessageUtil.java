package example.a03;

/*
 * This class prints the given message on console.
 */

public class MessageUtil {

    private String message;

    //Constructor
    //@param message to be printed

    public MessageUtil(String message){
        this.message = message;
    }

    public boolean emailFormCheck(String email) {
        boolean result = false;
        for (int i = 0; i < email.length(); i++) {
            if ( (int) email.charAt(i) == 64) {
                result = true;
            }
        }
        return result;
    }
    // prints the message
    public String printMessage(){
        System.out.println(message);
        return message;
    }
}
