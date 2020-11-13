<h1 align="center">
    <img height="250" hidth="250" src="https://i.pinimg.com/originals/e1/de/99/e1de99a598c38a545a57bcd75832a858.png">
</h1>

# :panda_face: - Toshokan
*<div align="center">Toshokan est une application mobile qui référence les mangas et donne la possibilité de se faire une liste personnalisée pour suivre les news sur les mangas choisis.</div>*

## MY JSON SERVER
Utilisation du site [my-json-server](https://my-json-server.typicode.com/) comme 'fake' serveur API Rest (le fameux db.json)<br>
Efficacité ? Comme ça :thumbsup:

## FONCTIONNE
- [X] Requête API REST
- [X] HomeFragment
    - [X] RecyclerView
- [X] AboutFragment
    - [X] Lien / Icon
    - [X] FloatButton (onClickListener->Prononciation de l'App)

## A FAIRE
- [ ] HomeFragment
    - [ ] Le button AIMER ET PARTAGER sont non-foncionnel
- [ ] Ajout dans le fragement Favorite lors du clique sur AIMER
- [ ] Tester la persistance des données pour la liste personnalisé

## :books: Bibliothèques utilisées :

- Pour la gestion de requête [Retrofit 2](https://square.github.io/retrofit/)
- Pour parser le code Json [GSON](https://github.com/google/gson)
- Transformer l'url(img) en image [Picasso](https://square.github.io/picasso/)
- CardView / RecylcerView pour le listing et design des listes

## Implémentations :

-- RETROFIT2(Requete API REST) + GSON(parser le Json) + PICASSO(url>img)<br>

<bq>implementation 'com.squareup.retrofit2:retrofit:2.9.0'<br>
<bq>implementation 'com.squareup.retrofit2:converter-gson:2.6.2'<br>
<bq>implementation 'com.squareup.picasso:picasso:2.71828'<br>
    
-- CARDVIEW POUR LISTER LES ITEMS DANS LE RECYCLERVIEW<br>

<bq>implementation 'androidx.cardview:cardview:1.0.0'<br>
<bq>implementation 'androidx.recyclerview:recyclerview:1.1.0'<br>

## :stars: Soutenir

Pour suivre son avancé .. Give a :star: !

## :camera: Quelques images
<h1 align="center">
    <img width="300" height="507" src="https://imagizer.imageshack.com/img922/5637/xVqNzz.png"> <img width="300" height="507" src="https://imagizer.imageshack.com/img922/4215/7ul1ta.png"> <img width="300" height="507" src="https://imagizer.imageshack.com/img922/678/16sbIF.png">
</h1>

## :scroll: License

APACHE © [Enzo Candotti](https://www.enzocandotti.fr/)
