import java.time.LocalDateTime;

/**
 * Created by I062070 on 16/03/2017.
 */
public class Example {
    private StringBuilder stringBuilder = new StringBuilder();

    public void checkSecurity(String[] people) {
        sendAlert(people);
        String found = foundMiscreant(people);
        someLaterCode(found);
    }

    private void sendAlert(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals ("Don")){
                sendAlert();
                return;
            }
            if (people[i].equals ("John")){
                sendAlert();
                return;
            }
        }
    }

    private String foundMiscreant(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals ("Don")){
                return "Don";
            }
            if (people[i].equals ("John")){
                return "John";
            }
        }
        return "";
    }

    public void someLaterCode(String found) {
    }


    public void sendAlert() {
        stringBuilder.append(LocalDateTime.now());
    }
}

