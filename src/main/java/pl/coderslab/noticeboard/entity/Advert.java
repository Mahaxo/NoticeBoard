package pl.coderslab.noticeboard.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "advert")
public class Advert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String image;
    private LocalDateTime expiryDate;
    private boolean isActive;



}
