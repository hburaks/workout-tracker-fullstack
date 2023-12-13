package com.hbdev.workouttrackerbackend.model.responseDTO;

import com.hbdev.workouttrackerbackend.util.BaseResponseDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WorkoutWithoutProfileResponseDTO extends BaseResponseDTO {
    private String notes;
    private int duration;
    private double totalWeight;
    private List<WorkoutExerciseWithoutWorkoutAndTemplateResponseDTO> workoutExerciseList;
}