package com.example.tmf666.Service;

import com.example.tmf666.Entity.ApplicationApproval;
import com.example.tmf666.Pojo.UpdateApplicationRequest;
import com.example.tmf666.Repo.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;

    public ApplicationApproval createApplication(ApplicationApproval application) {
        return applicationRepository.save(application);
    }

    public List<ApplicationApproval> getAllApplications() {
        return applicationRepository.findAll();
    }

    public Optional<ApplicationApproval> getApplicationById(String id) {
        return applicationRepository.findById(id);
    }

    public Optional<ApplicationApproval> updateApplication(String id, UpdateApplicationRequest updateApplicationRequest) {
        Optional<ApplicationApproval> existingApplicationOptional = applicationRepository.findById(id);
        if (existingApplicationOptional.isPresent()) {
            ApplicationApproval existingApplication = existingApplicationOptional.get();
            existingApplication.setType(updateApplicationRequest.getType());
            existingApplication.setOperationalState(updateApplicationRequest.getOperationalState());


            return Optional.of(applicationRepository.save(existingApplication));
        } else {
            return Optional.empty();
        }
    }
}
