package com.example.advanced.entity.pet;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TBL_OWNER")
@Getter @Setter @ToString
public class Owner {
    @Id @GeneratedValue
    private Long id;
    private String ownerName;
    @Column(unique = true)
    private String ownerPhone;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    @JoinColumn(name = "OWNER_ID")
    List<Pet> pets = new ArrayList<>();
}
