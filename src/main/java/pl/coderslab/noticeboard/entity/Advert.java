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
    @ManyToOne
    private Category category;
    @OneToMany
    private Comment comment;
    @OneToOne
    private User user;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
