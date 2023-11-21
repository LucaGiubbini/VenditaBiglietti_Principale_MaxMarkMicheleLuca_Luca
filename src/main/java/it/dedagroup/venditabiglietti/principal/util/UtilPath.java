package it.dedagroup.venditabiglietti.principal.util;

public class UtilPath {

	//-------------------------------------------SUPER ADMIN------------------------------------------------------/
	public static final String SUPER_ADMIN_PATH = "/superAdmin";
	
	public static final String AGGIUNGI_ADMIN = "admin/add";
	public static final String DISATTIVA_ADMIN = "admin/deactivate";
	
	//-------------------------------------------ADMIN------------------------------------------------------/
	public static final String ADMIN_PATH = "/admin";
	
	public static final String ELIMINA_UTENTE_VENDITORE = "/elimina-utente-venditore";
	public static final String ELIMINA_UTENTE_CLIENTE = "/elimina-utente-cliente";
	public static final String AGGIUNGI_UTENTE_VENDITORE = "/aggiungi-utente-venditore";
	public static final String AGGIUNGI_CATEGORIA = "/aggiungi-categoria";
	public static final String AGGIUNGI_SETTORE ="/aggiungi-settore";

	//-------------------------------------------GENERAL------------------------------------------------------/
	public static final String GENERAL_PATH = "/all";
	public static final String REGISTRAZIONE = "/registrazioneCliente";
	public static final String LOGIN = "/login";
	public static final String EVENTI_FUTURI_CON_BIGLIETTI = "/trovaEventiFuturiConBiglietti";
	public static final String FILTRA_EVENTI = "/filtraEventi";
}
