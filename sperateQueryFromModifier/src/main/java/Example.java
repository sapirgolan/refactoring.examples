import java.time.LocalDateTime;

/**
 * Created by I062070 on 16/03/2017.
 */
public class Example {
    private StringBuilder stringBuilder = new StringBuilder();

    public void checkSecurity(String[] people) {
        String found = foundMiscreant(people);
        someLaterCode(found);
    }

    private String foundMiscreant(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals ("Don")){
                sendAlert();
                return "Don";
            }
            if (people[i].equals ("John")){
                sendAlert();
                return "John";
            }
        }
        return "";
    }

    public void someLaterCode(String found) {
    }


    private void sendAlert() {
        stringBuilder.append(LocalDateTime.now());
    }
}

