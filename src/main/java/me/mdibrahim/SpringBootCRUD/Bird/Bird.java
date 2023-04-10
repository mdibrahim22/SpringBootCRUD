package me.mdibrahim.SpringBootCRUD.Bird;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Bird {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String Name;
    private String Color;

    public Bird(String name, String color) {
        Name = name;
        Color = color;
    }
}
