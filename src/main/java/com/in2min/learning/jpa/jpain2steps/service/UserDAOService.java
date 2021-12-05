package com.in2min.learning.jpa.jpain2steps.service;

import com.in2min.learning.jpa.jpain2steps.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public void getUsers(){
        CriteriaBuilder builder=entityManager.getCriteriaBuilder();
        CriteriaQuery cq=builder.createQuery(User.class);
        Root<User> user=cq.from(User.class);
        Predicate fname=builder.equal("","")

    }


    public long insert(User user){
        entityManager.persist(user);
        return user.getId();


    }
}
