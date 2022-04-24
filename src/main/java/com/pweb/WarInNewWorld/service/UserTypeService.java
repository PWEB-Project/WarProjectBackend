package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.model.UserType;
import com.pweb.WarInNewWorld.repository.NewsTypeRepository;
import com.pweb.WarInNewWorld.repository.UserTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class UserTypeService {
    private UserTypeRepository userTypeRepository;

    public UserTypeService(UserTypeRepository userTypeRepository) {
        this.userTypeRepository = userTypeRepository;
    }

    public void addUserType(UserType userType)
    {
        userTypeRepository.save(userType);
    }

    public void deleteUserType(Long userTypeId) {
        userTypeRepository.deleteById(userTypeId);
    }
}
