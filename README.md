# Gestion de Produits - Application Web JEE (All In One Spring MVC Thymeleaf Spring Security)

![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge)
![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=Spring-Security&logoColor=white)
![Bootstrap](https://img.shields.io/badge/Bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white)

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
     ```text
         src/
         ├── main/
         │   ├── java/net/safae/springmvc/
         │   │   ├── entities/          # Entités JPA (ex: Product.java)
         │   │   ├── repositories/      # Interfaces Spring Data (ex: ProductRepository.java)
         │   │   ├── web/               # Contrôleurs MVC (ex: ProductController.java)
         │   │   ├── security/          # Configuration Spring Security (ex: SecurityConfig.java)
         │   │   └── SpringMvcApplication.java  # Point d'entrée de l'application
         │   │
         │   └── resources/
         │       ├── templates/         # Vues Thymeleaf (HTML)
         │       │   ├── products.html       # Liste des produits
         │       │   ├── new-product.html    # Formulaire de création
         │       │   ├── edit-product.html   # Formulaire d'édition  
         │       │   ├── login.html          # Page de connexion
         │       │   └── notAuthorized.html  # Page d'erreur 403
         │       │
         │       ├── static/            # Ressources statiques
         │       │   ├── css/           # Feuilles de style
         │       │   ├── js/            # Fichiers JavaScript
         │       │   └── images/        # Images
         │       │
         │       └── application.properties # Configuration de l'application
         │
         └── test/                     # Tests unitaires et d'intégration
     ```
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
     - Login Admin :
       <img width="1280" alt="login" src="https://github.com/user-attachments/assets/da31e8d1-357b-4b5d-bd88-8b3398afc5cb" />
       - Invalid Login :
         <img width="1280" alt="invalid" src="https://github.com/user-attachments/assets/c16b19c7-a90d-4026-aecb-e7d904ba8c22" />

     - Logout :
       <img width="1280" alt="logout" src="https://github.com/user-attachments/assets/58314b5e-a890-4d08-a539-76e42b5b6137" />

     - Affichage de la liste des produits
       <img width="1280" alt="pages1" src="https://github.com/user-attachments/assets/6bd6fb48-2394-4e60-a0b4-64141bc80159" />

     - Ajout d'un Produit :
       <img width="1280" alt="beforeNew" src="https://github.com/user-attachments/assets/537e5c32-fedb-473d-b914-35f78758395a" />
       <img width="1279" alt="afterNew" src="https://github.com/user-attachments/assets/a3e1e9ec-0869-40f0-b1ff-0ae447e91c5e" />
       - Validation :
         <img width="1280" alt="fields" src="https://github.com/user-attachments/assets/ab490007-b71e-43fa-b136-d7522370cade" />


     - Suppression d'un produit
       <img width="1280" alt="delete" src="https://github.com/user-attachments/assets/75c76974-31c0-4425-bc5b-d91ed4cb95ce" />
       <img width="1280" alt="afterDelete" src="https://github.com/user-attachments/assets/7cb92aa6-9289-4e08-bc1f-e16cfdb8ec00" />

     - Page template basée sur Thymeleaf layout et Bootstrap
     - Saisie et ajout d'un produit avec validation du formulaire
     - Recherche de produits
       <img width="1279" alt="search" src="https://github.com/user-attachments/assets/c02c2da5-7137-4a28-b1ce-83717d42f0ad" />
     - Édition et mise à jour des produits
       <img width="1280" alt="beforeEdit" src="https://github.com/user-attachments/assets/7cb3906a-d64b-4993-bb86-46d13aa7d3cf" />
       <img width="1279" alt="edit" src="https://github.com/user-attachments/assets/e343b5a7-204d-4961-a592-dd75bbf8e09d" />
       <img width="1280" alt="afterEdit" src="https://github.com/user-attachments/assets/b44ca960-8895-41a6-bab5-b01039283178" />


     - Pagination des résultats
     - Login 'USER' :
       <img width="1280" alt="safae" src="https://github.com/user-attachments/assets/dde927a2-3a79-4965-be4c-9987b4a6b148" />

     - Access Denied :
       <img width="1279" alt="denied" src="https://github.com/user-attachments/assets/4b62aec7-a221-4eb4-8cab-3eea8c8ed6f7" />

      

7. **Sécurisation de l'application**
   - Mise en place de Spring Security
   - Puisque il ne faut pas stocker les mots de passe en clair dans la base de données, on utilise : InMemoryUserDetailsManager pour la base de données in Memory comme H2, sinon dans MySQL (n'importe quel JDBC) pour le stocker hashé
   - 403 : Not Authorized pour les utilisateurs, juste admins
  
ameliorations : register modification de profils

**Auteur :** Safae ERAJI
