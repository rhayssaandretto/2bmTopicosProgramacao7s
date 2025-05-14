package com.example.atividadeJWT2BIM.model;

import com.example.atividadeJWT2BIM.enums.Status;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "tb_task")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @Enumerated(EnumType.STRING)
    private Status status;

}
