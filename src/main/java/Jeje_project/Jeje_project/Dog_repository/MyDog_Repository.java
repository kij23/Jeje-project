package Jeje_project.Jeje_project.Dog_repository;

import Jeje_project.Jeje_project.Dog_domain.MyDog;

import java.util.List;

public interface MyDog_Repository {
    MyDog save(MyDog myDog);
    List<MyDog> findbyOwner(Long Owner_id);
}
