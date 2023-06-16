package sheridan.sin12743.assignment2.pets.Data;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "pets")

public class Pets {


    @jakarta.persistence.Id
    @Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Column(name = "name")
    private String name;

    @Column(name = "kind")
    private String kind;

    @Column(name = "sex")
    private String sex;

    @Column
            (name = "vaccinated")
    private boolean vaccinated;

    public Pets() {
    }

    public Pets(String name, String kind, String sex, boolean vaccinated) {
        this.name = name;
        this.kind = kind;
        this.sex = sex;
        this.vaccinated = vaccinated;
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", sex='" + sex + '\'' +
                ", vaccinated=" + vaccinated +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }


}