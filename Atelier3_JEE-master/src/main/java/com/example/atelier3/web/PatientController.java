package com.example.atelier3.web;

import com.example.atelier3.entities.Patient;
import com.example.atelier3.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    private PatientRepository patientRepository;

    @GetMapping(path="/index") //http localhost /index cette methode va s'executer et retournera une vue
    public String patients(Model model, @RequestParam(name="page",defaultValue = "0") int page,@RequestParam(name="size",defaultValue = "5")  int size,@RequestParam(name="keyword",defaultValue = "")  String keyword ){
        /*Page<Patient> patients=patientRepository.findAll(PageRequest.of(page,size));*/
        Page<Patient> patients=patientRepository.findByNomContains(keyword,PageRequest.of(page, size));
        model.addAttribute("listpatient",patients.getContent());
        model.addAttribute("pages", new int[patients.getTotalPages()]);
        model.addAttribute("currentPage", page);
        model.addAttribute("keyword",keyword);
        return "patients"; //la methode retourne une vus qui sappelle patients.html base sur thymeleaf
    }
    @GetMapping("/delete")
    public String delete(long id, String keyword, int page){
        patientRepository.deleteById(id);
        return "redirect:/index";
    }
}
