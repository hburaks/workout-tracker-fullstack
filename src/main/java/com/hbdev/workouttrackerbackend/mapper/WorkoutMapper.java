package com.hbdev.workouttrackerbackend.mapper;

import com.hbdev.workouttrackerbackend.database.entity.WorkoutEntity;
import com.hbdev.workouttrackerbackend.model.requestDTO.WorkoutRequestDTO;
import com.hbdev.workouttrackerbackend.model.responseDTO.WorkoutResponseDTO;
import com.hbdev.workouttrackerbackend.model.responseDTO.checked.WorkoutFinishedResponseDTO;
import com.hbdev.workouttrackerbackend.model.responseDTO.checked.WorkoutStartedResponseDTO;
import com.hbdev.workouttrackerbackend.util.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface WorkoutMapper extends BaseMapper<WorkoutEntity, WorkoutResponseDTO, WorkoutRequestDTO> {
    WorkoutMapper INSTANCE = Mappers.getMapper(WorkoutMapper.class);

    WorkoutStartedResponseDTO entityToStartedResponseDto(WorkoutEntity entity);

    WorkoutFinishedResponseDTO entityToFinishedResponseDto(WorkoutEntity entity);

    List<WorkoutFinishedResponseDTO> entityListToFinishedResponseDto(List<WorkoutEntity> entityList);


}