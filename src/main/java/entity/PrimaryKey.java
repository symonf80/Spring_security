package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor

@Embeddable
public class PrimaryKey implements Serializable {
    private String name;
    private String surname;
    private int age;

}
