// Fonction compterSuperieursSeuil
int compterSuperieursSeuil(int[] tableau, int seuil) {
    int compteur = 0;
    for (int i=0;i< tableau.length;i++){
        if (tableau[i]>seuil){
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

    // 5. Demander le seuil
    int seuil=Integer.parseInt(IO.readln("Entrez le seuil : "));

    // 6. Appeler la fonction
    int nbre=compterSuperieursSeuil(tableau,seuil);

    // 7. Afficher le résultat
    IO.println(String.format("Nombre d'éléments supérieurs à %d : %d",seuil,nbre));


}
