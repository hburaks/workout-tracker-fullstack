package com.hbdev.workouttrackerbackend.controller;

import com.hbdev.workouttrackerbackend.database.entity.WorkoutEntity;
import com.hbdev.workouttrackerbackend.database.repository.WorkoutRepository;
import com.hbdev.workouttrackerbackend.mapper.WorkoutMapperI;
import com.hbdev.workouttrackerbackend.model.WorkoutResponseDTO;
import com.hbdev.workouttrackerbackend.model.requestDTO.WorkoutRequestDTO;
import com.hbdev.workouttrackerbackend.service.WorkoutService;
import com.hbdev.workouttrackerbackend.util.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("workout")
public class WorkoutController extends BaseController<WorkoutRequestDTO, WorkoutResponseDTO, WorkoutEntity, WorkoutMapperI, WorkoutRepository, WorkoutService> {
   @Autowired
   WorkoutService workoutService;

    @Override
    protected WorkoutService getService() {
        return workoutService;
    }
}
