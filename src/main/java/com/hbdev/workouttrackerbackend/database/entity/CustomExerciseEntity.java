package com.hbdev.workouttrackerbackend.database.entity;

import com.hbdev.workouttrackerbackend.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "custom_exercises")
@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class CustomExerciseEntity extends BaseEntity {

    private Double volume;

    private String note;

    private Integer restTime;

    @OneToMany(mappedBy = "customExercise", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<SetEntity> sets;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "default_exercise_id")
    private DefaultExerciseEntity defaultExercise;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private ProfileEntity profile;

    @ManyToOne
    @JoinColumn(name = "workout_id")
    private WorkoutEntity workout;

    @ManyToOne
    @JoinColumn(name = "workout_template_id")
    private WorkoutTemplateEntity workoutTemplate;

}
