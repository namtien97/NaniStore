package com.nanistore.demo.entity;

import com.vladmihalcea.hibernate.type.json.JsonStringType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "configuration")
@Table(name = "configuration")
@TypeDef(
        name = "json",
        typeClass = JsonStringType.class
)
public class Configuration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Type(type = "json")
    @Column(name = "nani_choices",columnDefinition = "json")
    private ArrayList<String> naniChoices;
}
