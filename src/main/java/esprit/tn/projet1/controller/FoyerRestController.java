package esprit.tn.projet1.controller;

import esprit.tn.projet1.service.IchambreService;
import esprit.tn.projet1.service.IfoyerService;
import esprit.tn.projet1.service.foyerserviceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service

@RestController
@RequiredArgsConstructor
@RequestMapping("/chambre")
public class FoyerRestController {
    @Autowired
    IfoyerService foyerService;

    @PutMapping("/assignBloc/{blocId}/{foyerId}")
    public ResponseEntity<String> assignBlocToFoyer(@PathVariable Long blocId, @PathVariable Long foyerId) {
        foyerService.assignBlocToFoyer(blocId, foyerId);
        return ResponseEntity.ok("Bloc affecté au foyer !");
    }
}
