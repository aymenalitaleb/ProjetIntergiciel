package Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "User")
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    @Column(nullable = false, length = 45)
    private String Username;

    @Column(nullable = false, length = 45)
    private String Email;

    @Column(nullable = false, length = 254)
    private String Password ;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Publication> lesPublications = new HashSet<>();

    public User() {
    }

    public User(String username, String email, String password) {
        Username = username;
        Email = email;
        Password = password;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Set<Publication> getLesPublications() {
        return lesPublications;
    }

    public void setLesPublications(Set<Publication> lesPublications) {
        this.lesPublications = lesPublications;
    }
}
