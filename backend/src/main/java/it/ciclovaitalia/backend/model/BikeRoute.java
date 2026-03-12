package it.ciclovaitalia.backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BikeRoute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //nome ciclabile
    private String name;
    //regione in cui risiede
    private String region;
    //lunghezza in Km
    private Double lengthKm;
    //tipo di superficie
    private String surface;
    //difficolta(Facile - Media - Difficile)
    private String difficulty;
    //risulta essere ufficiale
    private Boolean official;
    //dato verificato
    private Boolean verified;
}

