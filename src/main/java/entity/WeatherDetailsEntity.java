package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "WeatherDetails") // EMRI I TABELES NE DB
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class WeatherDetailsEntity {


    @Column(name = "temp")
    private double temp;

    @Column(name = "humidity")
    private double humidity;

    @Column(name = "wind_speed ")
    private double windSpeed;

    @Column(name = "pressure ")
    private double pressure;

}
