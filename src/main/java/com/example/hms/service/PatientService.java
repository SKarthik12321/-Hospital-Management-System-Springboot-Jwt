package com.example.hms.service;

import com.example.hms.dto.PatientDto;
import com.example.hms.entity.Patient;
import com.example.hms.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientDto createPatient(PatientDto dto) {
        Patient patient = Patient.builder()
                .name(dto.getName())
                .age(dto.getAge())
                .gender(dto.getGender())
                .disease(dto.getDisease())
                .address(dto.getAddress())
                .phoneNumber(dto.getPhoneNumber())
                .build();
        Patient saved = patientRepository.save(patient);
        return mapToDto(saved);
    }

    public List<PatientDto> getAllPatients() {
        return patientRepository.findAll()
                .stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    public PatientDto getPatientById(Long id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found with id: " + id));
        return mapToDto(patient);
    }

    public PatientDto updatePatient(Long id, PatientDto dto) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found with id: " + id));
        patient.setName(dto.getName());
        patient.setAge(dto.getAge());
        patient.setGender(dto.getGender());
        patient.setDisease(dto.getDisease());
        patient.setAddress(dto.getAddress());
        patient.setPhoneNumber(dto.getPhoneNumber());
        return mapToDto(patientRepository.save(patient));
    }

    public void deletePatient(Long id) {
        if (!patientRepository.existsById(id)) {
            throw new RuntimeException("Patient not found with id: " + id);
        }
        patientRepository.deleteById(id);
    }

    private PatientDto mapToDto(Patient patient) {
        return PatientDto.builder()
                .id(patient.getId())
                .name(patient.getName())
                .age(patient.getAge())
                .gender(patient.getGender())
                .disease(patient.getDisease())
                .address(patient.getAddress())
                .phoneNumber(patient.getPhoneNumber())
                .build();
    }
}
