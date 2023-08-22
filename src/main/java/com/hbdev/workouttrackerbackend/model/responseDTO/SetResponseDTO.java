package com.hbdev.workouttrackerbackend.model.responseDTO;

import com.hbdev.workouttrackerbackend.util.BaseResponseDTO;
import lombok.Data;

@Data
public class SetResponseDTO extends BaseResponseDTO {

    private double weight;
    private int reps;
    private int setOrder;


    WorkoutExerciseResponseDTO workoutExercise;
}