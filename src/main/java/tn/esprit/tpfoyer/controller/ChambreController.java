package tn.esprit.tpfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.enums.TypeChambre;
import tn.esprit.tpfoyer.service.chambre.IChambreService;

import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("chambre")
public class ChambreController {
    private final IChambreService chambreService;

    @GetMapping
    public List<Chambre> findAll() {
        return chambreService.findAll();
    }

    @GetMapping("{id}")
    public Chambre findById(@PathVariable Long id) {
        return chambreService.findById(id).orElseThrow();
    }

    @PostMapping
    public Chambre create(@RequestBody Chambre chambre) {
        return chambreService.create(chambre);
    }

    @PutMapping
    public Chambre update(@RequestBody Chambre chambre) {
        return chambreService.update(chambre);
    }

    @DeleteMapping
    public void deleteAll() {
        chambreService.deleteAll();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        chambreService.deleteById(id);
    }

    @GetMapping("/byNumero")
    public Chambre findByNumeroChambre(@RequestParam Long numeroChambre) {
        return chambreService.findByNumeroChambre(numeroChambre);
    }

    @GetMapping("/byType")
    public List<Chambre> findByTypeChambre(@RequestParam TypeChambre typeChambre) {
        return chambreService.findByTypeChambre(typeChambre);
    }

    @GetMapping("/byBlocId")
    public List<Chambre> findByBlocIdBloc(@RequestParam Long blocId) {
        return chambreService.findByBlocIdBloc(blocId);
    }

    @GetMapping("/byBlocIdAndType")
    public List<Chambre> findByBlocIdBlocAndTypeChambre(@RequestParam Long blocId, @RequestParam TypeChambre typeChambre) {
        return chambreService.findByBlocIdBlocAndTypeChambre(blocId, typeChambre);
    }

    @GetMapping("/byNumeroAndType")
    public List<Chambre> findByNumeroChambreAndTypeChambre(@RequestParam Long numeroChambre, @RequestParam TypeChambre typeChambre) {
        return chambreService.findByNumeroChambreAndTypeChambre(numeroChambre, typeChambre);
    }

    @GetMapping("/byUniversityAndYearAndStudent")
    public List<Chambre> findByBlocFoyerUniversiteNomUniversiteAndReservationsAnneUniversitaireAndReservationsEtudiantListNomEtudiantAndNumeroChambre(
            @RequestParam String nomUniversite, @RequestParam LocalDate anneUniversitaire, @RequestParam String nomEtudiant, @RequestParam Long numeroChambre) {
        return chambreService.findByBlocFoyerUniversiteNomUniversiteAndReservationsAnneUniversitaireAndReservationsEtudiantListNomEtudiantAndNumeroChambre(
                nomUniversite, anneUniversitaire, nomEtudiant, numeroChambre);
    }

    @GetMapping("/countByTypeAndFoyer")
    public long countByTypeChambreAndBlocFoyerNomFoyer(@RequestParam TypeChambre typeChambre, @RequestParam String nomFoyer) {
        return chambreService.countByTypeChambreAndBlocFoyerNomFoyer(typeChambre, nomFoyer);
    }
}
