package com.hbdev.workouttrackerbackend.controller;

import com.hbdev.workouttrackerbackend.database.entity.DefaultExerciseEntity;
import com.hbdev.workouttrackerbackend.database.repository.DefaultExerciseRepository;
import com.hbdev.workouttrackerbackend.database.specification.DefaultExerciseSpecification;
import com.hbdev.workouttrackerbackend.mapper.DefaultExerciseMapper;
import com.hbdev.workouttrackerbackend.model.requestDTO.DefaultExerciseRequestDTO;
import com.hbdev.workouttrackerbackend.model.responseDTO.DefaultExerciseResponseDTO;
import com.hbdev.workouttrackerbackend.service.DefaultExerciseService;
import com.hbdev.workouttrackerbackend.util.BaseController;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
@RequiredArgsConstructor
public class DefaultExerciseController extends BaseController<DefaultExerciseRequestDTO, DefaultExerciseResponseDTO, DefaultExerciseEntity, DefaultExerciseMapper, DefaultExerciseRepository, DefaultExerciseSpecification, DefaultExerciseService> {
    private final DefaultExerciseService defaultExerciseService;

    @Override
    protected DefaultExerciseService getService() {
        return defaultExerciseService;
    }

}