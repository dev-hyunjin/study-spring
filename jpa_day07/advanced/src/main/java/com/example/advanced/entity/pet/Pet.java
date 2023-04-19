package com.example.advanced.entity.pet;

import com.example.advanced.type.GenderType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "TBL_PET")
@Getter @Setter @ToString
public class Pet {
    @Id @GeneratedValue
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private GenderType gender;
    private String disease;
}
