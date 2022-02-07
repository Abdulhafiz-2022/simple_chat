package Client;
import java.time.LocalDateTime;

public class Message {
    private String name;
    private String message;
    private LocalDateTime DT;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public LocaDateTime setDate(LocalDateTime dateTime)
    {
        DT=dateTime;
    
    
    }
      public LocaDateTime getDate()
    {
       return DT;
    
    
    }
}
