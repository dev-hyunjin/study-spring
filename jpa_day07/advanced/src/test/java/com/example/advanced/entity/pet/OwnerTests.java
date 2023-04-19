package com.example.advanced.entity.pet;

import com.example.advanced.repository.pet.OwnerDAO;
import com.example.advanced.type.GenderType;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;

@SpringBootTest
@Transactional
@Rollback(false)
@Slf4j
public class OwnerTests {
    @Autowired
    private OwnerDAO ownerDAO;

    @Test
    public void saveTest() {
        Owner owner = new Owner();
        Pet pet1 = new Pet();
        Pet pet2 = new Pet();

        pet1.setName("개");
        pet1.setGender(GenderType.MALE);
        pet1.setDisease("감기");

        pet2.setName("고양이");
        pet2.setGender(GenderType.FEMALE);
        pet2.setDisease("타박상");

        owner.setOwnerName("정현진");
        owner.setOwnerPhone("010-1234-1234");

        owner.getPets().add(pet1);
        owner.getPets().add(pet2);

        ownerDAO.save(owner);
    }

    @Test
    public void findByIdTest() {
        ownerDAO.findById(1L).map(Owner::toString).ifPresent(log::info);
    }

    @Test
    public void findAllTest() {
        ownerDAO.findAll().stream().map(Owner::toString).forEach(log::info);
    }

    @Test
    public void updateTest() {
        ownerDAO.findById(1L).ifPresent(owner -> owner.getPets().get(0).setDisease("햄스트링"));
    }

    @Test
    public void deleteTest() {
        ownerDAO.findById(1L).ifPresent(ownerDAO::delete);
    }
}
