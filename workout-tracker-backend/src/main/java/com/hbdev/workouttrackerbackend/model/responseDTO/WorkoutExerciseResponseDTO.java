package com.hbdev.workouttrackerbackend.model.responseDTO;

import com.hbdev.workouttrackerbackend.util.BaseResponseDTO;
import lombok.Data;

import java.util.List;

@Data
public class WorkoutExerciseResponseDTO extends BaseResponseDTO {
    private String notes;
    private int setOrder;
    private int restTime;
    private ExerciseWithoutWorkoutExerciseResponseDTO exercise;
    private WorkoutTemplateWithoutWorkoutExerciseResponseDTO workoutTemplate;
    private List<SetWithoutWorkoutExerciseResponseDTO> setList;
}