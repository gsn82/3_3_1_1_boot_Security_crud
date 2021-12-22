package com.example.demo.DAO;

import com.example.demo.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleDAO {
    List<Role> getRoles();
    Role getRoleById(String id);
    Role getRoleByName(String name);
}
