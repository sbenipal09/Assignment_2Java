package sheridan.sin12743.assignment2.pets.Data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sheridan.sin12743.assignment2.pets.Data.PetsRepository;
import sheridan.sin12743.assignment2.pets.Data.PetsRepository;

import java.util.List;
import java.util.Optional;

@Configuration
public class RepositoryConfiguration {

    @Bean
    public PetsRepository petsRepository() {
        return new PetsRepository() {
            @Override
            public void save() {

            }

            @Override
            public Optional<Pets> findById() {
                return Optional.empty();
            }

            @Override
            public List<Pets> findAll() {
                return null;
            }

            @Override
            public Pets save(Pets pet) {
                return null;
            }

            @Override
            public List<Pets> findByName(String name) {
                return null;
            }

            @Override
            public List<Pets> findByKind(String kind) {
                return null;
            }

            @Override
            public List<Pets> findBySex(String sex) {
                return null;
            }

            @Override
            public List<Pets> findByVaccinated(boolean vaccinated) {
                return null;
            }

            @Override
            public void deleteById(Long id) {

            }
        };
    }
}
