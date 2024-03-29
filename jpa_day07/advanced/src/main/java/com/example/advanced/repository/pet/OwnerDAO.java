package com.example.advanced.repository.pet;

import com.example.advanced.entity.pet.Owner;
import com.example.advanced.entity.pet.Pet;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Repository
public class OwnerDAO {
    @PersistenceContext
    private EntityManager entityManager;

//    주인 추가
    public Owner save(Owner owner) {
        entityManager.persist(owner);
        return owner;
    }

//    동물 추가
    public Pet save(Pet pet) {
        entityManager.persist(pet);
        return pet;
    }

//    주인 조회
    public Optional<Owner> findById(Long id) {
        String query = "select o from Owner o join fetch o.pets where o.id = :id";
        return Optional.ofNullable(
                entityManager.createQuery(query, Owner.class)
                .setParameter("id", id)
                .getSingleResult()
        );
    }

//    동물 조회
    public Optional<Pet> findPetById(Long id) {
        return Optional.ofNullable(entityManager.find(Pet.class, id));
    }

//    전체 조회
    public List<Owner> findAll() {
        String query = "select o from Owner o";
        return entityManager.createQuery(query, Owner.class).getResultList();
    }

//    삭제
    public void delete(Owner owner) {
        entityManager.remove(owner);
    }
}
