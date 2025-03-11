package esprit.tn.projet1.controller;

import esprit.tn.projet1.entity.chambre;
import esprit.tn.projet1.service.IchambreService;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Service

@RestController
@RequiredArgsConstructor
@RequestMapping("/chambre")
public class chambreRestController {
    @Autowired
    IchambreService chambreService;



    @GetMapping("/retrieve-all-chambres")
    public List<chambre> getChambres() {
        return chambreService.retrieveAllChambres();
    }

    @GetMapping("/retrieve-chambre/{chambreId}")
    public chambre retrieveChambre(@PathVariable("chambreId") Long chambreId) {
        return chambreService.retrieveChambre(chambreId);
    }

    @PostMapping("/add-chambre")
    public ResponseEntity<?> addChambre(@RequestBody chambre chambre) {
        try {
            chambre savedChambre = chambreService.addChambre(chambre);
            return new ResponseEntity<>(savedChambre, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Erreur : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @DeleteMapping("/remove-chambre/{chambreId}")
    public void removeChambre(@PathVariable("chambreId") Long chambreId) {
        chambreService.removeChambre(chambreId);
    }

    @PutMapping("/modify-chambre")
    public chambre modifyChambre(@RequestBody chambre chambre) {
        return chambreService.modifyChambre(chambre);
    }
}
