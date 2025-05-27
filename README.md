# 🎮 Jeu du Pendu en Java

Un jeu du Pendu en ligne de commande développé en Java, dans le cadre d’un exercice pratique pour renforcer mes compétences en programmation orientée objet, manipulation des chaînes de caractères et gestion de l’entrée utilisateur.

## 🚀 Fonctionnalités

- Sélection aléatoire d’un mot à deviner
- Affichage dynamique du mot en cours (lettres et tirets)
- 10 vies au départ, une vie perdue par mauvaise lettre
- Prise en compte des lettres déjà devinées
- Détection de la victoire ou de la défaite
- Interface utilisateur simple via le terminal

## 🛠️ Technologies

- Java (Standard Edition)
- `java.util.Random`
- `java.util.Scanner`

## 🎯 Règles du jeu

1. Le mot à deviner est choisi au hasard.
2. À chaque tour, le joueur entre une lettre.
3. Si la lettre est dans le mot, elle est révélée à toutes ses positions.
4. Sinon, une vie est retirée.
5. Le joueur gagne s’il devine toutes les lettres avant de perdre toutes ses vies.

## 📦 Installation & Exécution

### Prérequis

- Java JDK installé (`javac` et `java` disponibles)

### Compilation

```bash
javac PenduGame.java
