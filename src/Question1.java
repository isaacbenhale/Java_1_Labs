void main() {
    //1. Créer des tableaux pour stocker les articles
    String[] noms = {"Ordinateur portable","Souris sans fil","Clavier mécanique","Ecran 24 pouces"};
    int[] quantites = {1,2,1,2};
    double[] prixUnitaires = {1299.99,35.50,89.99,249.00};

    // 2. Afficher l'en-tête de la facture
    String enteteFacture=String.format(
            "%s%s%s%n%-25s%-7s%-12s%-12s%n%s","=".repeat(21)," FACTURE ","=".repeat(21),
            "Article","Qté","P.U.","Total","-".repeat(51)
    );
    IO.println(enteteFacture);

    // 3. Afficher chaque article avec calculs
    double sousTotal=0.0;
    for (int i=0;i<noms.length;i++){
        String ligneDuRecu=String.format("%-25s%-7d%-12.2f%-12.2f",noms[i],quantites[i],prixUnitaires[i],quantites[i]*prixUnitaires[i]);
        IO.println(ligneDuRecu);
        sousTotal+=quantites[i]*prixUnitaires[i];
    }
    IO.println("-".repeat(51));

    // 4. Calculer et afficher taxes et total
    double taxes=sousTotal*0.15;
    double total=sousTotal+taxes;

    String piedFacture=String.format(
            "%31s %s%.2f%n%32s%s%.2f%n%32s%s%.2f%n%s","","Sous-total: ",sousTotal," ",
            "Taxes (15%): ",taxes," ","TOTAL: ",total,"=".repeat(51)
    );
    IO.println(piedFacture);


}