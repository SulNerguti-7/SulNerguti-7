package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Coordinates")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class WeatherCordinatesEntity {

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "latitude")
    private double latitude;


}
