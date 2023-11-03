import java.util.Objects;

public class Departement {
    private int identifiant;
    private String nom;

    public Departement() {
        // Constructeur sans paramètre
    }

    public Departement(int identifiant, String nom) {
        this.identifiant = identifiant;
        this.nom = nom;
    }

    // Getters et Setters
    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Departement departement = (Departement) obj;
        return identifiant == departement.identifiant;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifiant);
    }
}
