package com.hbdev.workouttrackerbackend.model.responseDTO.checked;

import com.hbdev.workouttrackerbackend.util.BaseResponseDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WorkoutTemplateInProfileResponseDTO extends BaseResponseDTO {

    private String name;

    private List<CustomExerciseInWorkoutTemplateResponseDTO> customExerciseList;

}
