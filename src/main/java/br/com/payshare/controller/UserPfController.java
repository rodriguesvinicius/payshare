package br.com.payshare.controller;


import br.com.payshare.api.UserApiController;
import br.com.payshare.dto.UserDto;
import br.com.payshare.dto.users.UserDTO;
import br.com.payshare.model.Lobby;
import br.com.payshare.model.UserPf;
import br.com.payshare.service.LobbyService;
import br.com.payshare.service.UserPfService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserPfController implements UserApiController {

    UserPfService userPfService;
    LobbyService lobbyService;

    @Autowired
    public UserPfController(UserPfService userPfService, LobbyService lobbyService) {
        this.userPfService = userPfService;
        this.lobbyService = lobbyService;
    }

    @Override
    @PreAuthorize("hasRole('ROLE_USER')")
    public ResponseEntity<List<UserDTO>> findAll() {
        UserDTO dto = new UserDTO();
        List<UserDTO> userDTOS = new ArrayList<>();
        List<UserPf> userPfList = userPfService.findAll();
        if (userPfList.isEmpty())
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        else
            for (UserPf user : userPfList) {
                BeanUtils.copyProperties(user, dto);
                userDTOS.add(dto);
            }

        return new ResponseEntity<>(userDTOS, HttpStatus.OK);
    }

    @Override
    @PreAuthorize("hasRole('ROLE_USER')")
    public ResponseEntity<List<UserDTO>> findUsersByLobby(long id) {
        Lobby lobbyUsers = lobbyService.findById(id);
        UserDTO dto = new UserDTO();
        List<UserDTO> userDTO = new ArrayList<>();
        List<UserPf> userPfList = userPfService.findByLobby(lobbyUsers);
        if (lobbyUsers == null)
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        else
            for (UserPf user : userPfList) {
                BeanUtils.copyProperties(user, dto);
                userDTO.add(dto);
            }

        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }

    @Override
    @PreAuthorize("hasRole('ROLE_USER')")
    public ResponseEntity<UserDTO> findById(long id) {
        UserPf user = userPfService.findByUserId(id);
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);

        if (user == null)
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }

    @Override
    @PreAuthorize("hasRole('ROLE_USER')")
    public ResponseEntity<?> save(UserDTO userPf) throws InstantiationException, IllegalAccessException {
        if (userPf != null) {
            UserPf userEntity = new UserPf();
            UserDTO response = new UserDTO();
            BeanUtils.copyProperties(userPf, userEntity);
            userEntity = userPfService.save(userEntity);
            BeanUtils.copyProperties(userEntity, response);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    @PreAuthorize("hasRole('ROLE_USER')")
    public ResponseEntity<?> update(UserDTO userPf, long id) throws InstantiationException, IllegalAccessException {
        UserPf userEntity = userPfService.findByUserId(id);
        if (userEntity == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            if (userPf != null) {
                UserPf user = userDtoToEntity(userPf, userEntity);
                if (user == null) {
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }else {
                    UserDTO response = new UserDTO();
                    user = userPfService.save(user);
                    BeanUtils.copyProperties(user , response);
                    return new ResponseEntity<>(response, HttpStatus.OK);
                }
            } else {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        }
    }

    @Override
    @PreAuthorize("hasRole('ROLE_USER')")
    public ResponseEntity<Void> delete(long id) {
        UserPf deleteBy = userPfService.findByUserId(id);
        if (deleteBy == null)
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        userPfService.deleteById(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    private UserPf userDtoToEntity(UserDTO userDTO, UserPf userPfPrevious) {
        if (userDTO != null && userPfPrevious != null) {
            userPfPrevious.setUserAmount(userDTO.getUserAmount() != null ? userDTO.getUserAmount() : userPfPrevious.getUserAmount());
            userPfPrevious.setUserAmountLobby(userDTO.getUserAmountLobby() != null ? userDTO.getUserAmountLobby() : userPfPrevious.getUserAmountLobby());
            userPfPrevious.setUserLobbyHost(userDTO.isUserLobbyHost() ? userDTO.isUserLobbyHost() : userPfPrevious.isUserLobbyHost());
            userPfPrevious.setCpf(userDTO.getCpf() != null ? userDTO.getCpf() : userPfPrevious.getCpf());
            userPfPrevious.setRg(userDTO.getRg() != null ? userDTO.getRg() : userPfPrevious.getRg());
            userPfPrevious.setCardSchemas(!userDTO.getCardSchemas().isEmpty() ? userDTO.getCardSchemas() : userPfPrevious.getCardSchemas());
            userPfPrevious.setTransactions(!userDTO.getTransactionList().isEmpty() ? userDTO.getTransactionList() : userPfPrevious.getTransactions());
            userPfPrevious.setTransactionWallets(!userDTO.getTransactionWallets().isEmpty() ? userDTO.getTransactionWallets() : userPfPrevious.getTransactionWallets());
            userPfPrevious.setAddress(userDTO.getAddress() != null ? userDTO.getAddress() : userPfPrevious.getAddress());
            userPfPrevious.setCep(userDTO.getCep() != null ? userDTO.getCep() : userPfPrevious.getCep());
            userPfPrevious.setAge(userDTO.getAge() != null ? userDTO.getAge() : userPfPrevious.getAge());
            userPfPrevious.setCity(userDTO.getCity() != null ? userDTO.getCity() : userPfPrevious.getCity());
            userPfPrevious.setEmail(userDTO.getEmail() != null ? userDTO.getEmail() : userPfPrevious.getEmail());
            userPfPrevious.setState(userDTO.getState() != null ? userDTO.getState() : userPfPrevious.getState());
            userPfPrevious.setName(userDTO.getName() != null ? userDTO.getName() : userPfPrevious.getName());
            userPfPrevious.setLobbyUserList(!userDTO.getLobbyUserList().isEmpty() ? userDTO.getLobbyUserList() : userPfPrevious.getLobbyUserList());

            return userPfPrevious;
        }

        return null;
    }

}
