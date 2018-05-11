package Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Commentaire")
public class Commentaire implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCommentaire;

    @Column(nullable = false, length = 254)
    private String Contenue;

    @ManyToOne
    @JoinColumn(name="idPublication")
    private Publication publication;

    public Commentaire() {
    }

    public Commentaire(String contenue, Publication publication) {
        Contenue = contenue;
        this.publication = publication;
    }

    public int getIdCommentaire() {
        return idCommentaire;
    }

    public void setIdCommentaire(int idCommentaire) {
        this.idCommentaire = idCommentaire;
    }

    public String getContenue() {
        return Contenue;
    }

    public void setContenue(String contenue) {
        Contenue = contenue;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }
}
