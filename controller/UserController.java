package org.example.controller;

import org.example.model.User;

public interface UserController <T extends User>{

    void create(String firstName, String lastName, String middleName);
}
