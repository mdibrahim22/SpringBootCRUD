package me.mdibrahim.SpringBootCRUD.Bird;

import java.util.List;

public interface BirdService {
    Bird add(Bird bird);
    List<Bird>getBirds();
    Bird update(Bird bird);
}
