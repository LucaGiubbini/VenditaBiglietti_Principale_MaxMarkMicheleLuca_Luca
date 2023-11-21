package it.dedagroup.venditabiglietti.principal.controller;

import it.dedagroup.venditabiglietti.principal.dto.request.AggiungiUtenteDTORequest;
import it.dedagroup.venditabiglietti.principal.dto.request.LoginDTORequest;
import it.dedagroup.venditabiglietti.principal.dto.response.EventoDTOResponse;
import it.dedagroup.venditabiglietti.principal.facade.GeneralFacade;
import it.dedagroup.venditabiglietti.principal.model.Evento;
import it.dedagroup.venditabiglietti.principal.model.Utente;
import it.dedagroup.venditabiglietti.principal.security.GestoreToken;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(GENERAL_PATH)
public class GeneralController {

    @Autowired
    GeneralFacade gFac;
    @Autowired
    GestoreToken gestoreToken;

    @PostMapping(REGISTRAZIONE)
    public ResponseEntity<Void> registrazioneCliente(@Valid @RequestBody AggiungiUtenteDTORequest req){
        gFac.registrazioneCliente(req);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @PostMapping(LOGIN)
    public ResponseEntity<String> login(@Valid @RequestBody LoginDTORequest request){
        Utente u=gFac.login(request);
        return ResponseEntity.status(HttpStatus.ACCEPTED).header("Authorization",gestoreToken.generaToken(u)).body("Benvenuto!");
    }

    @GetMapping(EVENTI_FUTURI_CON_BIGLIETTI)
    public ResponseEntity<List<EventoDTOResponse>> eventiFutConBiglietti(){
        return ResponseEntity.status(HttpStatus.OK).body(gFac.trovaEventiFuturiConBiglietti());
    }

}
