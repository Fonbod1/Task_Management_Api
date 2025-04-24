package com.KF48.ToDo.List.TaskModel;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "completed")
    private boolean completed = false;
    //private LocalDateTime createdAt = LocalDateTime.now();



}
