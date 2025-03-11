package esprit.tn.projet1.service;

import esprit.tn.projet1.entity.Bloc;

import java.util.List;

public interface IblocService {
    public List<Bloc> retrieveAllBlocs();
    public Bloc retrieveBloc(Long blocId);
    public Bloc addBloc(Bloc b );
    public void removeBloc(Long idChambre);
    public Bloc modifyBloc(Bloc bloc);
    public void bloc() ;

}
