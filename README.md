# 🛍️ Gestion de Produits - Application Web JEE

## 🎯 Objectif  
Créer une application web JEE avec :  
- 🍃 **Spring Boot**  
- 🗃️ **Spring Data JPA** + **Hibernate**  
- 🌿 **Thymeleaf**  
- 🔒 **Spring Security**  

## 🛠️ Étapes de développement  

1. **🚀 Initialisation du projet**  
   - 📦 Dépendances :  
     - 🌐 `Spring Web`  
     - 🗄️ `Spring Data JPA`  
     - 🏷️ `H2` / `MySQL`  
     - 📝 `Thymeleaf`  
     - ⚡ `Lombok`  
     - 🔐 `Spring Security`  
     - ✔️ `Spring Validation`  

2. **📊 Modèle de données**  
   - 🏷️ Création de l’entité JPA `Product` (`@Entity`)  

3. **💾 Couche DAO**  
   - 📂 Interface `ProductRepository` (`JpaRepository`)  

4. **🧪 Tests**  
   - ✅ Validation des opérations CRUD  

5. **⚙️ Configuration Spring Security**  
   - 🔓 Désactivation temporaire de la sécurité par défaut  

6. **🌐 Interface Web (MVC + Thymeleaf)**  
   - 📋 Affichage liste des produits (`@GetMapping`)  
   - 🗑️ Suppression d’un produit (`@DeleteMapping`)  
   - � Template Bootstrap (`th:fragment`)  
   - ✏️ Formulaire d’ajout avec validation (`@Valid`)  

7. **🔐 Sécurisation finale**  
   - 👤 Authentification (Login/Mot de passe)  
   - 🛡️ Autorisations (ROLE_ADMIN, ROLE_USER)  

8. **✨ Bonus**  
   - 🔍 Recherche de produits (`LIKE %keyword%`)  
   - ✨ Édition/Mise à jour (`@PutMapping`)  

---  
**🚀 Projet prêt pour le déploiement !**  
