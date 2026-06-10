import activity.Activity;
import java.util.ArrayList;
import java.util.List;

public class Workflow {

    private List<Activity> activities = new ArrayList<>();

    public void registerActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Activity> getActivities() {
        return activities;
    }
}