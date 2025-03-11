package esprit.tn.projet1.controller;

import esprit.tn.projet1.entity.Bloc;
import esprit.tn.projet1.service.IblocService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bloc")
public class blocRestController {

@Autowired
private  IblocService blocService;

    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() {
        return blocService.retrieveAllBlocs();
    }

    @GetMapping("/retrieve-bloc/{blocId}")
    public Bloc retrieveBloc(@PathVariable("blocId") Long blocId) {
        return blocService.retrieveBloc(blocId);
    }

    @PostMapping("/add-bloc")
    public ResponseEntity<?> addBloc(@RequestBody Bloc bloc) {
        try {
            Bloc savedBloc = blocService.addBloc(bloc);
            return new ResponseEntity<>(savedBloc, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Erreur : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/remove-bloc/{blocId}")
    public ResponseEntity<?> removeBloc(@PathVariable("blocId") Long blocId) {
        try {
            blocService.removeBloc(blocId);
            return new ResponseEntity<>("Bloc supprimé avec succès", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Erreur : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc bloc) {
        return blocService.modifyBloc(bloc);
    }
}
