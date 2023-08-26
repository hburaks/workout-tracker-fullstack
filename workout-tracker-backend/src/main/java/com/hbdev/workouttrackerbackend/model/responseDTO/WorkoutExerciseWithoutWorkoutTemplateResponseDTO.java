package com.hbdev.workouttrackerbackend.model.responseDTO;

import com.hbdev.workouttrackerbackend.util.BaseResponseDTO;
import lombok.Data;

import java.util.List;

@Data
public class WorkoutExerciseWithoutWorkoutTemplateResponseDTO extends BaseResponseDTO {
    private String notes;
    private int setOrder;
    private int restTime;

    private ExerciseWithoutWorkoutExerciseResponseDTO exercise;
    private WorkoutResponseDTO workout;
    private List<SetWithoutWorkoutExerciseResponseDTO> setList;
}
