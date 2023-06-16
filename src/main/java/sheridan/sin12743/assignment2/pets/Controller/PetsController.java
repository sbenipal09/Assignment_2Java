package sheridan.sin12743.assignment2.pets.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import sheridan.sin12743.assignment2.pets.Data.Pets;
import sheridan.sin12743.assignment2.pets.Data.PetsRepository;

import java.util.List;
import java.util.Optional;
@Controller

public class PetsController {
    private final PetsRepository petsRepository;
    private final Logger log = LoggerFactory.getLogger(PetsController.class);

    public PetsController(PetsRepository petsRepository) {
        this.petsRepository = petsRepository;
    }

    @GetMapping(value={"/","/index"})
    public String listPets(Model model) {
        List<Pets> pets = petsRepository.findAll();
        model.addAttribute("pets", pets);
        return "ListPets";
    }

    @PostMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("pet", new Pets());
        return "AddPetDetails";
    }
    public String addPet(@Valid @ModelAttribute("pet") Pets pet, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "AddPetDetails";
        }
        petsRepository.save(pet);
        return "redirect:/";
    }




   /* @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        Optional<Pets> optionalPet = petsRepository.findById();
        if (optionalPet.isPresent()) {
            model.addAttribute("pet", optionalPet.get());
            return "edit-pet";
        } else {
            return "redirect:/";
        }
    }*/

    @PostMapping("/edit/{id}")
    public String updatePet(@PathVariable("id") Long id, @Valid @ModelAttribute("pet") Pets updatedPet,
                            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "edit-pet";
        }
        Optional<Pets> optionalPet = petsRepository.findById();
        if (optionalPet.isPresent()) {
            Pets pet = optionalPet.get();
            pet.setName(updatedPet.getName());
            pet.setKind(updatedPet.getKind());
            pet.setSex(updatedPet.getSex());
            pet.setVaccinated(updatedPet.isVaccinated());
            petsRepository.save(pet);
        }
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deletePet(@PathVariable("id") Long id) {
        petsRepository.deleteById(id);
        return "redirect:/";
    }
}


