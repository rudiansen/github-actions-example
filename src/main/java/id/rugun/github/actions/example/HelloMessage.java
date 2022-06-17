package id.rugun.github.actions.example;

public class HelloMessage {
  
    String message;

    public HelloMessage() {};

    public HelloMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
