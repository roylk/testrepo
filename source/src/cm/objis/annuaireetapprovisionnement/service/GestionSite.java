package cm.objis.annuaireetapprovisionnement.service;

import java.util.List;

import cm.objis.annuaireetapprovisionnement.dao.Dao;
import cm.objis.annuaireetapprovisionnement.dao.IDao;
import cm.objis.annuaireetapprovisionnement.domaine.Agence;
import cm.objis.annuaireetapprovisionnement.domaine.Local;
import cm.objis.annuaireetapprovisionnement.domaine.Site;

/**
 * cette classe offre des impl�mentations aux m�thodes m�tiers d�finies dans
 * l'interface IGestionSite
 * 
 * @author R. KOUANI
 * @version 3.0
 * 
 */
public class GestionSite implements IGestionSite {
	private IDao dao;

	/**
	 * ceci est le contructeur qui prend en param�tre l'interface IGestion afin
	 * d'utiliser les m�thodes des classes qui l'impl�mentent
	 * 
	 * @param dao un objet IDAO
	 */
	public GestionSite(IDao dao) {
		super();
		this.dao = dao;
	}

	/**
	 * Ceci Constructeur par defaut de la classe GestionSites
	 */
	public GestionSite() {
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * Ceci permet d'afficher les d�tails d'un objet de type Site
	 * 
	 * @param site
	 *            un objet de type Site
	 * @see cm.objis.annuaireetapprovisionnement.service.IGestionSite#afficherSite(cm.objis.annuaireetapprovisionnement.domaine.Site)
	 */
	@Override
	public void afficherSite(Site site) {
		// TODO Auto-generated method stub
		System.out.println("Voici les informations concernant le site "
				+ site.getNom() + " : ");
		System.out.println(" id :" + site.getId());
		System.out.println(" ville de localisation : " + site.getVille()
				+ " adresse : " + site.getAdresse());
		System.out.println(" l'activit� principale de ce site est: "
				+ site.getActivite1());
	}

	/**
	 * permet d'afficher un message de confirmation de l'enregistrement d'un
	 * site
	 * 
	 * @param site
	 *            Un objet de type Site
	 * @see cm.objis.annuaireetapprovisionnement.service.IGestionSite#enregistrerSite(cm.objis.annuaireetapprovisionnement.domaine.Site)
	 */
	@Override
	public void enregistrerSite(Site site) {
		// TODO Auto-generated method stub

		System.out
				.println(" le traitement  d'enregistrement a r�ussi  pour le site "
						+ site.getNom());

	}

	/**
	 * Cette m�thode est en cours d'�laboration
	 * 
	 * @param site
	 *            Un objet de type Site
	 * @see cm.objis.annuaireetapprovisionnement.service.IGestionSite#supprimerSite(cm.objis.annuaireetapprovisionnement.domaine.Site)
	 */
	@Override
	public void supprimerSite(Site site) {
		// TODO Auto-generated method stub

	}

	/**
	 * Cette m�thode est en cours d'�laboration
	 * 
	 * @param site
	 *            un objet de type Site
	 * @see cm.objis.annuaireetapprovisionnement.service.IGestionSite#modifierSite(cm.objis.annuaireetapprovisionnement.domaine.Site)
	 */
	@Override
	public void modifierSite(Site site) {
		// TODO Auto-generated method stub

	}

	/**
	 * Cette methode permet d'afficher les d�tails d'une agence
	 * 
	 * @param agence
	 *            objet de type Agence une particularit� de Site
	 * @see cm.objis.annuaireetapprovisionnement.service.IGestionSite#afficherSite(cm.objis.annuaireetapprovisionnement.domaine.Agence)
	 */
	@Override
	public void afficherSite(Agence agence) {
		System.out
				.println("voici les informations concernant l'agence de type "
						+ agence.getTypeAgence() + " , " + agence.getNom()
						+ ":");
		System.out.println("id :" + agence.getId());
		System.out.println("ville de localisation : " + agence.getVille()
				+ " adresse : " + agence.getAdresse());
		System.out.println("l'activit� principale de ce site est: "
				+ agence.getActivite1());
		System.out.println("le responsable d'agence est :"
				+ agence.getResponsableAgence());
		System.out.println("Horaires d'ouverture :" + agence.getHoraires());
		// TODO Auto-generated method stub

	}

	/**
	 * M�thode qui affiche les d�tails concernant un local
	 * 
	 * @param local
	 *            Un objet de type Local
	 * @see cm.objis.annuaireetapprovisionnement.service.IGestionSite#afficherSite(cm.objis.annuaireetapprovisionnement.domaine.Local)
	 */
	@Override
	public void afficherSite(Local local) {
		// TODO Auto-generated method stub
		System.out
				.println("voici les informations concernant le local de type "
						+ local.getTypeLocal() + " , " + local.getNom() + ":");
		System.out.println("id :" + local.getId());
		System.out.println("ville de localisation : " + local.getVille()
				+ " adresse : " + local.getAdresse());
		System.out.println("l'activit� principale de ce site est: "
				+ local.getActivite1());
		System.out.println("le responsable du local est :"
				+ local.getResponsableLocal());
		System.out.println("Superficie :" + local.getSuperficieLocal()
				+ " m�tres carr�s");

	}

	/**
	 * cette m�thode r�cup�re et retourne dans la couche actuelle la liste des
	 * sites provenant de la base des donn�es
	 * 
	 * @return Une liste de site
	 * @see cm.objis.annuaireetapprovisionnement.service.IGestionSite#lectureServiceSites()
	 */
	@Override
	public List<Site> lectureServiceSites() {
		// TODO Auto-generated method stub
		// Dao dao = new Dao();
		return dao.lectureDaoSites();
	}

	/**
	 * Cette m�thode recupere la m�thode enregistrerDaoSite() contenant la
	 * requ�te d'insertion des attribut d'un objet Site dans la base de donn�es
	 * 
	 * @param site
	 *            Un objet de type Site
	 * @see cm.objis.annuaireetapprovisionnement.service.IGestionSite#enregistrerServiceSite(cm.objis.annuaireetapprovisionnement.domaine.Site)
	 */
	@Override
	public int enregistrerServiceSite(Site site) {
		return dao.enregistrerDaoSite(site);

	}

	/**
	 * cette m�thode r�cup�re et retourne dans la couche actuelle la liste des
	 * agences provenant de la base des donn�es
	 * 
	 * @see cm.objis.annuaireetapprovisionnement.service.IGestionSite#lectureServiceAgences()
	 * @return une liste de d'agence
	 */
	@Override
	public List<Agence> lectureServiceAgences() {
		// TODO Auto-generated method stub
		return dao.lectureDaoAgences();

	}

	/**
	 * cette m�thode r�cup�re et retourne dans la couche actuelle la liste des
	 * locaux provenant de la base des donn�es
	 * 
	 * @see cm.objis.annuaireetapprovisionnement.service.IGestionSite#lectureServiceLocaux()
	 * @return une liste des locaux
	 */
	@Override
	public List<Local> lectureServiceLocaux() {
		// TODO Auto-generated method stub
		return dao.lectureDaoLocaux();
	}

	/**
	 * Cette m�thode recupere la m�thode enregistrerDaoSite() contenant la
	 * requ�te d'insertion des attribut d'un objet Agence dans la base de
	 * donn�es
	 * 
	 * @param site
	 *            Un objet de type Agence
	 * @return un entier (1 ou 0)
	 * @see cm.objis.annuaireetapprovisionnement.service.IGestionSite#enregistrerServiceSite(cm.objis.annuaireetapprovisionnement.domaine.Agence)
	 */
	@Override
	public int enregistrerServiceSite(Agence site) {
		return dao.enregistrerDaoSite(site);

	}

	/**
	 * Cette m�thode recupere la m�thode enregistrerDaoSite() contenant la
	 * requ�te d'insertion des attribut d'un objet Local dans la base de donn�es
	 * 
	 * @param site
	 *            Un objet de type Local
	 * @return un entier (1 ou 0)
	 * @see cm.objis.annuaireetapprovisionnement.service.IGestionSite#enregistrerServiceSite(cm.objis.annuaireetapprovisionnement.domaine.Local)
	 */
	@Override
	public int enregistrerServiceSite(Local site) {
		return dao.enregistrerDaoSite(site);

	}

	/**
	 * Cette m�thode recupere la m�thode contenant la requ�te selection des
	 * utilisateurs dans la base de donn�es
	 * @param   login nom de l'utilisateur
	 * @param  passWord mot de passe
	 * @return un entier (sup�rieur ou �gal � 0)
	 */

	@Override
	public int loginService(String login, String passWord) {
		// TODO Auto-generated method stub
		return dao.loginDao(login, passWord);
	}

}
