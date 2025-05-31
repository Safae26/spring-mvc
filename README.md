# Gestion de Produits - Application Web JEE (All In One Spring MVC Thymeleaf Spring Security)

![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge)
![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=Spring-Security&logoColor=white)

Une application web complète de gestion de produits basée sur l'écosystème Spring.

## Objectif
Créer une application Web JEE basée sur :
- Spring Boot
- Spring Data JPA
- Hibernate
- Thymeleaf
- Spring Security

## L'application permet de gérer des produits avec les fonctionnalités suivantes.

- **CRUD complet** pour les produits
- **Authentification sécurisée** avec rôles (USER/ADMIN)
- **Validation des formulaires**
- **Interface responsive** avec Bootstrap
- **Recherche de produits**
- **Gestion des erreurs** (403, 404)

## Étapes de développement

1. **Initialisation du projet**
   - Création d'un projet Spring Boot avec les dépendances :
     - **Backend**
     - Spring Boot 3
     - 🔒 Spring Security
     - ✔️ Spring Validation
     - Spring Data JPA + Hibernate
     - Spring Web
     - **Base de données**
     - H2
     - Lombok
     - **Frontend**
     - Bootstrap 5
     - Thymeleaf
   - Structure du Projet : 
     src/
      ├── main/
      │ ├── java/net/safae/springmvc/
      │ │ ├── entities/ # Entités JPA
      │ │ ├── repositories/ # Interfaces Spring Data
      │ │ ├── web/ # Contrôleurs MVC
      │ │ ├── security/ # Configuration de sécurité
      │ │ └── SpringMvcApplication.java
      │ └── resources/
      │ ├── templates/ # Vues Thymeleaf
      │ ├── static/ # Assets statiques
      │ └── application.properties
      └── test/ # Tests
   - Configuration du fichier 'application.properties'
   - Configuration de Sécurité (SecurityConfig)
## ⚙️ Configuration
Configuration du fichier `application.properties`

### 🔐 Utilisateurs par défaut
| Username | Password | Rôles       |
|----------|----------|-------------|
| safae    | 1234     | USER        |
| user     | 1234     | USER        |
| admin    | 1234     | ADMIN, USER |

## 🌐 Points d'accès
| URL              | Description               | Rôle requis |
|------------------|---------------------------|-------------|
| /                | Redirection vers la liste | -           |
| /user/index      | Liste des produits        | USER        |
| /newProduct      | Formulaire d'ajout        | ADMIN       |
| /admin/delete    | Suppression d'un produit  | ADMIN       |
| /login           | Page de connexion         | -           |
| /logout          | Déconnexion               | -           |
| /notAuthorized   | Page 403 (Accès refusé)   | -           |
2. **Modèle de données**
   - Création de l'entité JPA `Product` (Modèle de Données)

3. **Couche d'accès aux données**
   - Création de l'interface `ProductRepository` basée sur Spring Data

4. **Tests**
   - Test de la couche DAO

5. **Configuration de sécurité**
   - Désactivation de la protection par défaut de Spring Security (au début)

6. **Couche Web et interface**
   - Création du contrôleur Spring MVC et des vues Thymeleaf pour :
     - Affichage de la liste des produits
     - Suppression d'un produit
     - Page template basée sur Thymeleaf layout et Bootstrap
     - Saisie et ajout d'un produit avec validation du formulaire

7. **Sécurisation de l'application**
   - Mise en place de Spring Security
   - Puisque il ne faut pas stocker les mots de passe en clair dans la base de données, on utilise : InMemoryUserDetailsManager pour la base de données in Memory comme H2, sinon dans MySQL (n'importe quel JDBC) pour le stocker hashé
   - 403 : Not Authorized pour les utilisateurs, juste admins

8. **Fonctionnalités supplémentaires**
   - Recherche de produits
   - Édition et mise à jour des produits, et profils
   - Pagination des résultats
