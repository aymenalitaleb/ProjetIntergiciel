package Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Publication")
public class Publication implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPublication;

    @Column(nullable = false, length = 45)
    private String Nom;

    @Column(nullable = false, length = 254)
    private String Description;

    @Column(nullable = false, length = 45)
    private String Categorie ;

    @OneToMany(mappedBy = "publication", cascade = CascadeType.ALL)
    private Set<Commentaire> lesCommentaires = new HashSet<>();

    @ManyToOne
    @JoinColumn(name="idUser")
    private User user;

    public Publication() {
    }

    public Publication(String nom, String description, String categorie, User user) {
        Nom = nom;
        Description = description;
        Categorie = categorie;
        this.user = user;
    }

    public int getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(int idPublication) {
        this.idPublication = idPublication;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getCategorie() {
        return Categorie;
    }

    public void setCategorie(String categorie) {
        Categorie = categorie;
    }

    public Set<Commentaire> getLesCommentaires() {
        return lesCommentaires;
    }

    public void setLesCommentaires(Set<Commentaire> lesCommentaires) {
        this.lesCommentaires = lesCommentaires;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
