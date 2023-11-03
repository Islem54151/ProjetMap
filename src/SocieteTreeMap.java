import java.util.TreeMap;

public class SocieteTreeMap implements InterfaceSociete {
    private TreeMap<Employe, Departement> employeDepartementMap;

    public SocieteTreeMap() {
        employeDepartementMap = new TreeMap<>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        employeDepartementMap.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        employeDepartementMap.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Employe e : employeDepartementMap.keySet()) {
            Departement d = employeDepartementMap.get(e);
            System.out.println(e + " travaille dans le département " + d);
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (Employe e : employeDepartementMap.keySet()) {
            System.out.println(e);
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (Departement d : employeDepartementMap.values()) {
            System.out.println(d);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        Departement d = employeDepartementMap.get(e);
        if (d != null) {
            System.out.println(e + " travaille dans le département " + d);
        } else {
            System.out.println(e + " n'est pas affecté à un département.");
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employeDepartementMap.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return employeDepartementMap.containsValue(d);
    }
}
