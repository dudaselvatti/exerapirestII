package br.ifsp.contacts.controller;

import br.ifsp.contacts.model.Contact;
import br.ifsp.contacts.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import java.util.Map;
import br.ifsp.contacts.exceptions.ResourceNotFoundException;


import java.util.List;

@RestController
@RequestMapping("/api/contacts")
@Validated

public class ContactController {

}
