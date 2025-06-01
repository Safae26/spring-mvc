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
     <img width="310" alt="structure" src="https://github.com/user-attachments/assets/df05ac27-6b79-4e7b-b362-aa0b3f9adac7" />
     <img width="307" alt="structure1" src="https://github.com/user-attachments/assets/cff13310-5833-4e0e-b9bc-96d11bfc40ba" />

   - Configuration du fichier 'application.properties'
     <img width="914" alt="prop" src="https://github.com/user-attachments/assets/22e73099-2a97-4e6a-84d4-7c1031dce38f" />
   - Configuration de Sécurité (SecurityConfig)
   - Dependances :
     <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-thymeleaf</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.webjars/bootstrap -->
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>bootstrap</artifactId>
            <version>5.3.5</version>
        </dependency>
        <dependency>
            <groupId>nz.net.ultraq.thymeleaf</groupId>
            <artifactId>thymeleaf-layout-dialect</artifactId>
        </dependency>
        <dependency>
            <groupId>org.thymeleaf.extras</groupId>
            <artifactId>thymeleaf-extras-springsecurity6</artifactId>
        </dependency>

        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
            <version>1.18.38</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
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
     <img width="912" alt="product" src="https://github.com/user-attachments/assets/3fe2efe9-5b03-424c-a598-123c123d6ebf" />

3. **Couche d'accès aux données**
   - Création de l'interface `ProductRepository` basée sur Spring Data
     <img width="912" alt="repo" src="https://github.com/user-attachments/assets/d0f75667-567a-4ca0-8494-a8c5e3987e66" />

4. **Tests**
   - Test de la couche DAO

5. **Configuration de sécurité**
   - Désactivation de la protection par défaut de Spring Security (au début)
   - SecurityConfig :
     <img width="914" alt="secc" src="https://github.com/user-attachments/assets/5001a071-85c0-4841-a9ba-3d6feee6e73f" />
     <img width="912" alt="seccc" src="https://github.com/user-attachments/assets/9eba52d3-996a-4c74-b006-f928d9bfd146" />
   - Controller :
     <img width="912" alt="controller" src="https://github.com/user-attachments/assets/22927d88-43a4-4e90-9bb0-76d7738428d2" />
     <img width="911" alt="controller1" src="https://github.com/user-attachments/assets/61df39d0-b316-490e-9e6a-fdd74768910e" />
     <img width="913" alt="controller2" src="https://github.com/user-attachments/assets/b354f3f1-9ae1-4a4c-a0e2-a19bcdaac3b9" />
     <img width="911" alt="controller3" src="https://github.com/user-attachments/assets/53b4e1a4-2ed1-49e7-a2d1-88161c515409" />

   - App :
     <img width="912" alt="app" src="https://github.com/user-attachments/assets/bbb39010-65d1-4c30-8e01-f6a8334b511d" />
     <img width="911" alt="app1" src="https://github.com/user-attachments/assets/d9ee9b1c-2627-4612-a26f-a309a10554d5" />


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
       <img width="1279" alt="pages2" src="https://github.com/user-attachments/assets/127eb01c-467c-4946-af8c-89c2ac19c17d" />
       <img width="1280" alt="pages3" src="https://github.com/user-attachments/assets/b7032e8e-bf08-47c4-8474-a558a6e5d70f" />
       <img width="1280" alt="pages4" src="https://github.com/user-attachments/assets/c51ebad9-da97-4cd2-ad2c-65a27f3ce82a" />


     - Ajout d'un Produit :
       <img width="1280" alt="beforeNew" src="https://github.com/user-attachments/assets/537e5c32-fedb-473d-b914-35f78758395a" />
       <img width="1280" alt="new" src="https://github.com/user-attachments/assets/b1343649-ef88-402d-8f3c-71a36008d15b" />
       <img width="1279" alt="afterNew" src="https://github.com/user-attachments/assets/a3e1e9ec-0869-40f0-b1ff-0ae447e91c5e" />
     - Validation :
       <img width="1280" alt="fields" src="https://github.com/user-attachments/assets/ab490007-b71e-43fa-b136-d7522370cade" />

     - home :
        <img width="1280" alt="home" src="https://github.com/user-attachments/assets/b3663226-f901-41e6-bb1e-ccd343d291fe" />
     
     - Suppression d'un produit
       <img width="1280" alt="products" src="https://github.com/user-attachments/assets/c22d6f05-1e6e-4395-9aaf-58097475e109" />
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

     - Recherche de produits
       ![Uploading search.png…]()

     - Pagination des résultats
     - Login 'USER' :
       <img width="1280" alt="safae" src="https://github.com/user-attachments/assets/dde927a2-3a79-4965-be4c-9987b4a6b148" />

     - Access Denied :
       <img width="1279" alt="denied" src="https://github.com/user-attachments/assets/4b62aec7-a221-4eb4-8cab-3eea8c8ed6f7" />

      

7. **Sécurisation de l'application**
   - Mise en place de Spring Security
   - Puisque il ne faut pas stocker les mots de passe en clair dans la base de données, on utilise : InMemoryUserDetailsManager pour la base de données in Memory comme H2, sinon dans MySQL (n'importe quel JDBC) pour le stocker hashé
   - 403 : Not Authorized pour les utilisateurs, juste admins
   - // 403 : Not Authorized
    // 404 : Page not found
    // 405 : Méthode pas autorisée
  
ameliorations : register modification de profils, show h2 db, keyword issues, ajouter un css, templates, mise a jours repo, verification d'app, rapport

**Auteur :** Safae ERAJI
