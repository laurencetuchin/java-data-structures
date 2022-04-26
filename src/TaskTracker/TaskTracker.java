package TaskTracker;

import java.util.ArrayList;
import java.util.HashMap;

public class TaskTracker {
    private HashMap<String, ArrayList<Integer>> completedExercises;

    public TaskTracker(HashMap<String, ArrayList<Integer>> completedExercises) {
        this.completedExercises = new HashMap<>();
    }

    public void add(String user, int exercise) {
        // an empty list has to be added for a new user if one has not already been added
        this.completedExercises.putIfAbsent(user, new ArrayList<>());

        // retrieve the list from the user containing exercises completed by user and add to it
        ArrayList<Integer> completed = this.completedExercises.get(user);
        completed.add(exercise);
    }

    public void print() {
        for (String name: completedExercises.keySet()) {
            System.out.println(name + ": " + completedExercises.get(name));
        }
    }


}
