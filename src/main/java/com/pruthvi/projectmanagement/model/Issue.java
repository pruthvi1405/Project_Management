package com.pruthvi.projectmanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;

    private String description;

    private String status;

    private Long ProjectID;

    private String priority;

    private LocalDate dueDate;

    private List<String> tags=new ArrayList<>();

    @ManyToOne
    private User assignee;

    @ManyToOne
    @JsonIgnore
    private Project project;

    @JsonIgnore
    @OneToMany(mappedBy = "issue",cascade =  CascadeType.ALL,orphanRemoval = true)
    private List<Comment> comments=new ArrayList<>();
}