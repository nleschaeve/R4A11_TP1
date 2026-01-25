# R4A11_TP1

## Question 1 : 
Dans l'arborescence du projet, l'emplacement du fichier xml est : 

R4A11_TP1\app\src\main\res\layout\activity_main.xml

## Question 2 : 
Sur la ligne 13 : android:text="Hello World!", j'ai modifié la chaîne de caractères entre guillemets pour afficher "Coucou j’ai trouvé comment faire".

## Question 3 :
Pour changer l'icon, il a fallu modifier la ligne 19 du fichier AndroidManifest.xml :
android:icon="@mipmap/ic_launcher". 

J'ai remplacé "ic_launcher" par le nom de l'icon que j'ai ajouté dans le dossier mipmap.

## Question 4 :
Il n'est pas nécessaire de cliquer sur le bouton valider pour afficher le texte saisi sur la seconde activité, 
car le texte est récupéré depuis l'EditText au moment du clic sur le bouton Suivant.

## Question 5 :
Le comportement de la question 4 me semble normal, car l'action de cliquer sur le bouton Suivant déclenche la récupération du texte saisi dans l'EditText, et le passe à la seconde activité via l'intent,
alors que le clic sur le bouton Valider modifie uniquement le texte affiché dans la même activité sans interaction avec l'autre activité.

## Question 6 :
Pour ne pas afficher le nouveau texte sur la deuxième activité tant que le bouton Valider n'a pas été cliqué, 
il faut modifier le comportement du bouton Suivant pour qu'il ne récupère le texte de l'EditText que si une certaine condition est remplie.
Par exemple, on peut utiliser une variable booléenne qui est mise à true uniquement lorsque le bouton Valider est cliqué.
Ensuite, lors du clique sur le bouton Valider, on met le texte saisi dans une variable, et c'est cette variable qui est passée à la deuxième activité.