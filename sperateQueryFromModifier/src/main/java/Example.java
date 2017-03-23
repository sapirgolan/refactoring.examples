import java.time.LocalDateTime;

/**
 * Created by I062070 on 16/03/2017.
 */
public class Example {
    private StringBuilder stringBuilder = new StringBuilder();

    public void checkSecurity(String[] people) {
        String found = foundMiscreant(people);
        sendAlert(found);
        someLaterCode(found);
    }

    private void sendAlert(String personName) {
        if ("Don".equals(personName) || "John".equals(personName)) {
            sendAlert();
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

