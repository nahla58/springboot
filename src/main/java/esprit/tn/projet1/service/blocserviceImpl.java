package esprit.tn.projet1.service;

import esprit.tn.projet1.entity.Bloc;

import esprit.tn.projet1.repository.blocrepository;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@RequiredArgsConstructor
@Service
public class blocserviceImpl implements IblocService{
    @Autowired
    blocrepository blocrepository;

    public List<Bloc> retrieveAllChambres() {
        return blocrepository.findAll();
    }

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return List.of();
    }
   @Override
    public Bloc retrieveBloc(Long blocId){return blocrepository.findById(blocId).orElse(null);};
    @Override
    public Bloc addBloc(Bloc bloc ){return blocrepository.save(bloc);}
    @Override
    public void removeBloc(Long blocId)  {
        blocrepository.deleteById(blocId);
    };
    @Override
    public Bloc modifyBloc(Bloc bloc) {
        return blocrepository.save(bloc);
    };

    @Override
    public void bloc() {

    }
}
