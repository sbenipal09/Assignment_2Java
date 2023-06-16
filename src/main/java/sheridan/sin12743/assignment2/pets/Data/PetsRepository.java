package sheridan.sin12743.assignment2.pets.Data;

import java.util.List;
import java.util.Optional;

public interface PetsRepository extends JpaRepository<Pets, Long>{
    void save();
    Optional<Pets> findById();
    List<Pets> findAll();

    Pets save(Pets pet);
    List<Pets> findByName(String name);

    List<Pets> findByKind(String kind);

    List<Pets> findBySex(String sex);

    List<Pets> findByVaccinated(boolean vaccinated);

    void deleteById(Long id);
}
