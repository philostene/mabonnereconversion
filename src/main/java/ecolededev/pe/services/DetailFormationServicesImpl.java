package ecolededev.pe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ecolededev.pe.domaine.DetailFormation;
import ecolededev.pe.domaine.repository.IDetailFormationRepository;

@Service
public class DetailFormationServicesImpl implements IDetailFormationServices {
	@Autowired
	IDetailFormationRepository detailFormationRepository;

	@Override
	public DetailFormation detailFormation(Long id) {
		return detailFormationRepository.findOne(id);
	}

	@Override
	public void updateDetailFormation(DetailFormation detailFormation) {
		detailFormationRepository.saveAndFlush(detailFormation);
	}

	@Override
	public void deleteDetailFormation(Long id) {
		detailFormationRepository.delete(id);
	}
}
