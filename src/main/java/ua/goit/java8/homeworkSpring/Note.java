package ua.goit.java8.homeworkSpring;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(schema = "spring_hw")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;

}
