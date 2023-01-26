package ExamsPreparation.Exam25June2022.workout;

import java.util.ArrayList;
import java.util.List;

public class Workout {
    private List<Exercise> exercises;
    private String type;
    private int exerciseCount;

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
        this.exercises = new ArrayList<>();
    }

    //•	Field exercises – List that holds added exercises.
    public List<Exercise> getExercises() {
        return exercises;
    }

    //•	Method adds an entity to the exercises
    public void addExercise(Exercise exercise) {
        // If there is still space on the workout sheet (exerciseCount).
        if (this.exercises.size() < exerciseCount) {
            exercises.add(exercise);
        }
    }

    //•	Method removes the exercise by given name and muscle,
    // if such exists, and returns boolean.
    public boolean removeExercise(String name, String muscle) {
        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(name) && exercise.getMuscle().equals(muscle)) {
                exercises.remove(exercise);
                return true;
            }
        }
        return false;
    }

    //Method returns the exercise with the given name and muscle
    // or null if there is no such exercise.
    public Exercise getExercise(String name, String muscle) {
        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(name) && exercise.getMuscle().equals(muscle)) {
                return exercise;
            }
        }
        return null;
    }

    //•	Method returns the exercise which is burned the most calories
    // or null if there are no exercises.
    public Exercise getMostBurnedCaloriesExercise() {
        //todo
        Exercise mostBurnedCalories = null;
        int mostCalories = -1;
        if (exercises.size() > 0) {
            for (Exercise exercise : exercises) {
                if (exercise.getBurnedCalories() >= mostCalories) {
                    mostBurnedCalories = exercise;
                    mostCalories = exercise.getBurnedCalories();
                }
            }
        }
        return mostBurnedCalories;

    }

    //•	Getter getExerciseCount() – returns the number of exercises.
    public int getExerciseCount() {
        return exercises.size();
    }

    //•	getStatistics() – returns a String in the following format:
    //o	"Workout type: {workout type}
    //Exercise: {Exercise1}
    //Exercise: {Exercise2}
    public String getStatistics() {
        StringBuilder result = new StringBuilder();
        result.append("Workout type: ").append(this.type).append("\n");
        for (Exercise exercise : exercises) {
            result.append(exercise).append("\n");
        }
        return result.toString();
    }
}

