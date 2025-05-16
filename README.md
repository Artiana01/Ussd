# PROG-5-USSD

Ce projet, c’est une simulation d’un menu USSD comme ceux qu’on utilise avec MVola, Orange Money ou YAS. Le but est de reproduire une navigation fluide dans le terminal, comme si on tapait un vrai code USSD sur un téléphone.

## Objectif

Je veux surtout que le code soit bien structuré, facile à lire et à maintenir.  
C’est pour ça que j’ai décidé d’y intégrer de bonnes pratiques de développement :

- Des noms clairs en **camelCase** pour les variables et méthodes
- Des noms de classes en **majuscule au début**
- Des fichiers organisés dans des packages logiques
- Un affichage propre dans le terminal

## Vérification du style

J’ai utilisé **Checkstyle** pour vérifier que le code respecte bien une convention claire.  
C’est pratique pour repérer les erreurs de style dès qu’on écrit mal ou qu’on oublie quelque chose.

### Comment lancer le linter

```bash
mvn checkstyle:check
# Ussd