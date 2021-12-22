package com.example.demo.DAO;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.demo.model.Role;

import java.util.List;


@Repository
public class RoleDAOImpl implements RoleDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Role> getRoles() {
        return entityManager.createQuery("select r from Role r", Role.class).getResultList();
    }

    @Override
    public Role getRoleById(String id) {
        return entityManager.find(Role.class, Long.valueOf(id));
    }

    @Override
    public Role getRoleByName(String name) {
        return entityManager.createQuery("select r from Role r where r.role= :name", Role.class)
                .setParameter("name", name).getSingleResult();
    }
}