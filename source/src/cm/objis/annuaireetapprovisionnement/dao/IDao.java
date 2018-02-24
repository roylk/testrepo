/**
 * 
 */
package cm.objis.annuaireetapprovisionnement.dao;

import java.util.List;

import cm.objis.annuaireetapprovisionnement.domaine.Agence;
import cm.objis.annuaireetapprovisionnement.domaine.Local;
import cm.objis.annuaireetapprovisionnement.domaine.Site;

/**
 * Cette interface contient toutes les methodes offrant des fonctionnalit�s
 * d'acc�s � la base de donn�e de l'application
 * 
 * @author R. KOUANI
 * @version 3.0
 * 
 */
public interface IDao {
	
	public List<Site> lectureDaoSites();

	public List<Agence> lectureDaoAgences();

	public List<Local> lectureDaoLocaux();

	public int enregistrerDaoSite(Site site);

	public int enregistrerDaoSite(Agence site);

	public int enregistrerDaoSite(Local site);
	
	public int loginDao(String login, String passWord);

};
