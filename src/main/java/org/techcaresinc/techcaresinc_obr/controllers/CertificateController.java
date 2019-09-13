package org.techcaresinc.techcaresinc_obr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.techcaresinc.techcaresinc_obr.entities.Certificate;
import org.techcaresinc.techcaresinc_obr.services.CertificateService;

import javax.validation.Valid;

@Controller
public class CertificateController {
    @Autowired
    private CertificateService service;

    @RequestMapping("/")
    public String root(Model model){

        Certificate certificate = new Certificate();
        model.addAttribute("certificate", certificate);

        return "index";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@Valid @ModelAttribute("certificate") Certificate certificate) {
        service.save(certificate);
        return "redirect:/?success";
    }
}
