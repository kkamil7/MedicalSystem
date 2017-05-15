package com.medicalsystem.controllers;

import com.medicalsystem.domain.Patient;
import com.medicalsystem.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    private Patient patient = new Patient("Mark", "Thompson", "M", 23);

    @RequestMapping(value = "/patients", method = RequestMethod.GET)
    public Patient patients() {
        return patientService.saveOrUpdate(patient);
    }
}
