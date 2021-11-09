package de.htwberlin.webtech.persistence;

import javax.persistence.*;

@Entity(name = "all_pokemon")
public class PokemonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "region", nullable = false)
    private String region;

    @Column(name = "is_evolved")
    private Boolean evolved;

    public PokemonEntity(Long id, String name, String region, Boolean evolved) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.evolved = evolved;
    }

    protected PokemonEntity() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Boolean getEvolved() {
        return evolved;
    }

    public void setEvolved(Boolean evolved) {
        this.evolved = evolved;
    }
}
