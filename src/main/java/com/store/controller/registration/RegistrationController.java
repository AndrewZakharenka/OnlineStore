package com.store.controller.registration;

import com.store.model.address.Address;
import com.store.model.personalData.PersonalData;
import com.store.model.role.Role;
import com.store.model.user.User;
import com.store.service.Service;
import com.store.service.impl.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegistrationController {

    private UserService userService;

    @GetMapping("/registration")
    public String index(Model model){
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user, Map<String, Object> model){
        User userFromDB = userService.getByEmail(user.getEmail());

        if (userFromDB.getEmail() != null){
            model.put("message", "User exists!");
            return "registration";
        }

        user.setRole(new Role("USER"));
        PersonalData personalData = new PersonalData();
        personalData.setAddress(new Address());
        user.setPersonalData(personalData);
        userService.saveUser(user);
        return "redirect:/login";
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
