// Fonction compterPositifs
int compterPositifs(int[] tableau) {
    int compteur = 0;
    for (int i=0;i<tableau.length;i++){
        if (tableau[i]>0){
            compteur++;
        }
    }
    return compteur;
}


// Programme principal
void main() {
    // 1. Demander la taille
    IO.print("Entrez la taille du tableau : ");
    int taille=Integer.parseInt(IO.readln());

    // 2. Vérifier si taille > 0
    if (taille <= 0) {
        IO.println("Erreur : La taille doit être un entier positif.");
        return;
    }

    // 3. Créer le tableau
    int[] tableau=new int[taille];

    // 4. Remplir le tableau
    for (int i=0;i<taille;i++){
        tableau[i]=Integer.parseInt(IO.readln("Entrez l'élément "+(i+1)+" : "));
    }

    // 5. Appeler la fonction et afficher le résultat
    int resultat=compterPositifs(tableau);
    IO.println("Nombre d'éléments positifs : " + resultat);

}
