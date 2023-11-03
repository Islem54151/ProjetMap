public class test {
    public static void main(String[] args) {

        SocieteHashMap societeHashMap = new SocieteHashMap();


        Employe e1 = new Employe("1456322", "M", "Islem", "zedsfgv");
        Employe e2 = new Employe("1268532", "z", "Manel", "qsfdgch");
        Departement d1 = new Departement(1, "sd");
        Departement d2 = new Departement(2, "wxsg");

        societeHashMap.ajouterEmployeDepartement(e1, d1);
        societeHashMap.ajouterEmployeDepartement(e2, d2);
        societeHashMap.afficherLesEmployesLeursDepartements();
        societeHashMap.supprimerEmploye(e1);
        societeHashMap.afficherLesEmployes();
        SocieteTreeMap societeTreeMap = new SocieteTreeMap();

        Employe e3 = new Employe("785423", "jk", "sdfg", "Jiji");
        Departement d3 = new Departement(3, "SAP");

        societeTreeMap.ajouterEmployeDepartement(e2, d2);
        societeTreeMap.ajouterEmployeDepartement(e3, d3);
        societeTreeMap.afficherLesEmployesLeursDepartements();
    }
}
