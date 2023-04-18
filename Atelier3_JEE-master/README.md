# Atelier3_JEE

Spring Boot Spring MVC Thymeleaf Spring Data 

En utilisant le framework spring boot, cette activité m'a permis d'approfondir mes connaissances. En créant une application qui permet de gérer les patients, en commencant par créer l'entité PATIENT, et en manipulant les données grace aux opérations CRUD. 

Les dépendances que j'ai utilisé sont Spring Web et le moteur de template Thymeleaf, Spring data JPA, Lombok, Spring web et H2 database. Et vers la fin je suis passée vers mysql.

    -Spring Data JPA fournit l’interface JpaRepository<T, ID> qui hérite de CrudRepository<T, ID> et qui fournit un ensemble de méthodes pour interagir avec une base de données relationnelle.
    
    -Lombok a pour but de générer à la compilation du code Java les getters, les setters, la methode toString, ainsi que les constructeurs avec ou sans parametre, à notre place. Tout se fait à l’aide de simples annotations poser dans les classes.
    
    -Spring Web permet de créer des applications Web basées sur Spring avec une configuration minimale.
    
    -H2 est une base de données rapide et légère.
    
    -Spring Web MVC est le module Spring consacré au développement d’application Web et d’API Web. Le nom de ce module renvoie directement au modèle MVC (Modèle Vue      Contrôleur).

    -Thymeleaf est un template engine. Principalement conçu pour produire des vues Web, il fournit un support pour la génération de documents HTML, XHTML, JavaScript et CSS (voire de n’importe quel format texte).
    
L'interface utilisateur se présente comme suit: /index
![image](https://user-images.githubusercontent.com/93864104/232347118-5d0afb37-3b54-44a3-8e53-31adc162eb81.png)

Il est possible de chercher des patients à partir de leur nom et de les supprimer:
![image](https://user-images.githubusercontent.com/93864104/232347193-1934f227-38f5-4109-9991-b638f02cd7f6.png)

Il est meme possible de naviguer entre les pages:
![image](https://user-images.githubusercontent.com/93864104/232348186-cd4e9837-7fcb-4079-98af-bee94e9739b5.png)
