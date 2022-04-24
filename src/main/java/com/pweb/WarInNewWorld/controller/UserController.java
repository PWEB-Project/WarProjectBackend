package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/user")
public class UserController {
    @Autowired
    UserService userService;

    @DeleteMapping(path = "/admin/delete-user/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> deleteSubject(@PathVariable Long id) {
        try {
            userService.deleteUser(id);
            return ResponseEntity.status(HttpStatus.OK).body("Deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
