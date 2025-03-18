package service;

import com.example.softwarem.SoftwareMApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.repositories;

import java.util.List;
import java.util.Optional;

@Service
public class SoftwareService {

    @Autowired
    private repositories.SoftwareRepository softwareRepository;

    public SoftwareMApplication salvarSoftware(SoftwareMApplication software) {
        return softwareRepository.save(software);
    }

    public List<SoftwareMApplication> obterTodosSoftwares() {
        return softwareRepository.findAll();
    }

    public Optional<SoftwareMApplication> obterSoftwarePorId(Long id) {
        return softwareRepository.findById(id);
    }

    public SoftwareMApplication atualizarSoftware(SoftwareMApplication software) {
        return softwareRepository.save(software);
    }

    public void deletarSoftware(Long id) {
        softwareRepository.deleteById(id);
    }
}