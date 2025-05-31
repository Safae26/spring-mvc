# Gestion de Produits - Application Web JEE

## Objectif
Créer une application Web JEE basée sur :
- Spring Boot
- Spring Data JPA
- Hibernate
- Thymeleaf
- Spring Security

L'application permet de gérer des produits avec les fonctionnalités suivantes.

## Étapes de développement

1. **Initialisation du projet**
   - Création d'un projet Spring Boot avec les dépendances :
     - Spring Web
     - Spring Data JPA
     - H2
     - MySQL
     - Thymeleaf
     - Lombok
     - Spring Security
     - Spring Validation

2. **Modèle de données**
   - Création de l'entité JPA `Product`

3. **Couche d'accès aux données**
   - Création de l'interface `ProductRepository` basée sur Spring Data

4. **Tests**
   - Test de la couche DAO

5. **Configuration de sécurité**
   - Désactivation de la protection par défaut de Spring Security

6. **Couche Web et interface**
   - Création du contrôleur Spring MVC et des vues Thymeleaf pour :
     - Affichage de la liste des produits
     - Suppression d'un produit
     - Page template basée sur Thymeleaf layout et Bootstrap
     - Saisie et ajout d'un produit avec validation du formulaire

7. **Sécurisation de l'application**
   - Mise en place de Spring Security

8. **Fonctionnalités supplémentaires**
   - Recherche de produits
   - Édition et mise à jour des produits
