package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Weather") // EMRI I TABELES NE DB
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class WeatherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "coordinate_id")
    private int coordinateId;
    @Column(name = "region_id")
    private int regionID;

    @OneToMany(mappedBy = "region", cascade = {CascadeType.ALL})
    private Set<WeatherRegionEntity> countries;

    

}
