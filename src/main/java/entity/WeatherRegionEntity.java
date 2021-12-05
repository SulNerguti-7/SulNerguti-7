package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Weather") // EMRI I TABELES NE DB
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WeatherRegionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_id")
    private Integer regionId;

    @Column(name = "country")
    private String country;

    @Column(name = "state")
    private String state;

    @Column(name = "name")
    private String city;

    @Column(name = "zip")
    private String zip;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private  WeatherEntity region;

    private


}
