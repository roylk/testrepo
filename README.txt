application [SDRS-SCMS:AnnuaireEtApprovisionnement] version 3.0.0.0	

	
	************************************
*****  	Description de l'application:   	*****
	************************************

[SDRS-SCMS AnnuaireEtApprovisionnement] est  application transfert de colis et annuaire d'entreprise. 
l'application   aura pour but de permettre aux entreprises d'avoir une visibilit� globale sur leurs 
diff�rentes filiales, sites, agences ... et permettra 
en m�me temps de g�rer l'acheminement des colis internes entre ces diff�rents sites g�olocalis�s.

Note: la version 3.0.0.0 actuelle de notre application offre d�sormais la possibilit� travers une interface graphique intuitive de:
- se connecter en entrant un login et un mot de passe correspondants aux utilisateurs cr��s stock�s dans la table users de la base de donn�es
Ce formulaire de connexion contr�le �galement ce que vous entrez et se comporte diff�remment selon que vous:
       - vous n'entrez rien
       - vous vous ne remplissez pas les deux champs
       - vous entrez des informations erronn�es
       - vous entrez les informations correctes 
-  Cr�er Enregistrer � travers des formulaires graphiques incluant le contr�le des donn�es des sites de divers types (par d�faut, agence, local) dans la base de donn�es
- Afficher les d�tails des sites existants et disponibles en bases de donn�es en fonction des types (par d�faut, agence, local) dans un rendu graphique sous forme de tableau en cliquant juste sur le bouton indiqu�
-rafraichir la liste des sites (par d�faut, agence, local) pour afficher les enregistrements les plus r�cents,
- Naviguer aisement entre les diff�rentes fen�tres,
- se d�connecter 
elle propose ces fonctionnalit�s regroup�es en deux modules(pour l'instant) � savoir:
- le module GESTION DES SITES (cr�ation, affichage fonctionnels,  mise � jour et suppression  en cours) par types 
- le module REPORTING qui est en cours d'impl�mentation
ces modules sont acc�ssibles depuis la page d'acceuil apr�s authentification � travers:
- les boutons de raccourci mis en oeuvres � cet effet
- les menus dans une barre qui offre les m�mes fonctionnalit�s
elle va int�grer plus tard
- un module de gestion des utilisateurs et des habilitation
- un ou plusieurs modules de gestion d'approvisionnement entre les diff�rents sites cr��s qui seront g�olocalisables
les aspects "modifier Site, et Supprimer un site sont en cours de compl�tion
	

	************************************
*****  	     Pr�-requis avant execution		*****
	************************************
afin de pouvoir installer et commencer a utiliser la version actuelle (3.0.0.0) de notre application l'utilisateur doit
- Disposer d'un environnement sur lequel est install� un JDK ou un JRE
Pour installer le JDK ou JRE dans votre environnement rendez vous ici: http://www.objis.com/formation-java/tutoriel-java-installation-jdk.html
et suivez les instructions qui conviennent � votre SE.
vous pouvez aussi suivre les instructions ci-apr�s:

	-Rendez-vous sur la partie Java du site d�Oracle : http://www.oracle.com/technetwork/java
	-Dans la zone de droite �software downloads�, cliquez sur le lien �Java SE� (pour Java Standard Edition)
	-Cliquez sur l�ic�ne �Java� pour t�l�charger le JDK
	-Accepter la licence
	-De pr�f�rence choisir la version la plus r�cente (derni�re sur la liste)
		-si votre machine est une 64 bit, choisir le jdk dont le nom a 'windows-X64' avant le '.exe'
		-si votre machine est une 32 bit, choisir le jdk dont le nom a 'windows-i586' avant le '.exe'
		-la version 32 bit fonctionne sur un Syst�me Windows 32 bit ou 64 bit.
	-Cliquez sur le bouton �Enregistrer le fichier�. Le t�l�chargement commence
	-Double cliquez sur le fichier t�l�charg�. L�assistant d�installation du JDK se lance
	-Cliquez sur le bouton �Next� des fen�tre qui vont s'afficher
	-Au moment d�installer un environnement d�ex�cution ind�pendant du JDK, l�assistant vous consulte. Acceptez les options par d�faut et cliquez sur Next
	-Ainsi m�me si vous supprimez par la suite le r�pertoire d�installation du JDK (qui contient aussi une JRE), vous pourrez tout de m�me ex�cuter des programmes Java sur votre ordinateur
	-Vous arrivez � l��cran de fin d�installation, qui vous pr�cise que l�installation s�est bien d�roul�e 
	-Cliquez sur Close: L�installation du JDK est termin�e. 
-T�l�charger et installer un SGBD MySQL(ou les outils qui l'int�grent)
     vous pouvez porter votre choix sur sur:
       - le package MySQl Workbench qui est t�l�chargeable gratuitement qui embarque un client en ligne de commande, 
         et qui peut aussi �tre synchronis� avec le client graphique SQLyog
       - le package WAMP qui int�gre le client graphique phpMyAdmin

- disposer du driver Mysql-connector-java pour assurer la communication entre l'application et la base de donn�e
(une copie accompagne le livrable de notre application)

- Savoir lancer les instructions en ligne de commande afin de pouvoir ex�cuter l'application
   
     

	************************************
*****  		Version du jdk utilis�e	  	*****
	************************************
pour cette version de notre application nous avons utilis� la version de jdk d�taill�e ci-dessous
java version "1.8.0_131"
Java(TM) SE Runtime Environment (build 1.8.0_131-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.131-b11, mixed mode)



	************************************
*****  	Documentation:			  	*****
	************************************

Veuillez suivre les indications suivantes pour acceder au contenu du javadoc 

1) ouvrir le dossier "livrable_module5_KOUANI" 
2) ouvrir le sous dossier "doc" qui s'y trouve
2) Double cliquez sur 'index.html'.

et vous pouvez intuitivement naviguer entre les pages

	
	************************************
***** 	Execution de l'application:    		*****
	************************************


Veuillez suivre les indications suivantes:
1) importer le fichier de sauvegarder de la base de donn�e annuaireetapprovisionnement.sql dans votre SGBD MySQL(ce fichier se trouve dans le dossier
   "livrable_module5_KOUANI" 

2)naviguer jusqu'� la racine contenant le fichier AnnuaireEtApprovisionnement.jar(vous pouvez le faire graphiquement)
3)une fois que vous y �tes, lancer l'invite commande en tant que administrateur(en cliquant sur "fichier">"ouvrir l'invite de commande">"ouvrir l'invite de commande en tant qu'administrateur")
4)executer la commande java -jar AnnuaireEtApprovisionnement.jar
5)loggez vous (login: objiscam mot de passe: objis ou login: ckroyl mot de passe: royl) et cliquer sur entrer ; vous pourrez ici tester les diff�rentes eventualit�s �num�rer plus haut
6) laissez vous guider par les interfaces intuitives  propos�es par l'application

NB: PENSEZ A PARCOURIR tous les menus et � essayer tous les boutons


 	