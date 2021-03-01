package br.com.payshare.api;


import br.com.payshare.PayshareApplication;
import br.com.payshare.dto.users.UserDTO;
import br.com.payshare.model.UserPf;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(PayshareApplication.API_PREFIX + "/payshare/user")
public interface UserApiController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<UserDTO>> findAll();

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<UserDTO> findById(@PathVariable long id);

    @PostMapping(path = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> save(@RequestBody UserDTO userPf)
            throws InstantiationException, IllegalAccessException;

    @PutMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> update(@RequestBody UserDTO userPf, @PathVariable long id)
            throws InstantiationException, IllegalAccessException;

    @DeleteMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Void> delete(@PathVariable long id);

    @GetMapping(path = "/lobby/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<UserDTO>> findUsersByLobby(@PathVariable long id);
}
