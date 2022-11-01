package br.com.theLoanBook.Libary_labschcool.controller;

import br.com.theLoanBook.Libary_labschcool.model.entity.Client;
import br.com.theLoanBook.Libary_labschcool.model.service.interfaces.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ServiceClient serviceClient;

    @PostMapping("/salavar")
    public ResponseEntity<Client> salvar(@RequestBody Client client){

        return  ResponseEntity.status(HttpStatus.CREATED).body(this.serviceClient.salvar(client));

    }

    @GetMapping("/clients")
    public ResponseEntity<List<Client>> listar() {
        return ResponseEntity.ok(this.serviceClient.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> buscar(@PathVariable Long id) {
        return ResponseEntity.ok(this.serviceClient.buscar(id));
    }



}
