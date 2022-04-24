package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.model.NewsType;
import com.pweb.WarInNewWorld.model.UserType;
import com.pweb.WarInNewWorld.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user-type")
public class UserTypeController {
    @Autowired
    UserTypeService userTypeService;

    @PostMapping(path = "/admin/add-user-type")
    public ResponseEntity<?> addUser(@RequestBody UserType userType) {
        try {
            userTypeService.addUserType(userType);
            return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.CREATED);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @DeleteMapping(path = "/admin/delete-user-type/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> deleteSubject(@PathVariable Long id) {
        try {
            userTypeService.deleteUserType(id);
            return ResponseEntity.status(HttpStatus.OK).body("Deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
