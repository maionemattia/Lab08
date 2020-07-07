package it.polito.tdp.extflightdelays.model;

public class Adiacenza {
	
	private Integer idPartenza;
	private Integer idArrivo;
	private Integer mediaVolo;
	/**
	 * @param idPartenza
	 * @param idArrivo
	 * @param mediaVolo
	 */
	public Adiacenza(Integer idPartenza, Integer idArrivo, Integer mediaVolo) {
		super();
		this.idPartenza = idPartenza;
		this.idArrivo = idArrivo;
		this.mediaVolo = mediaVolo;
	}
	/**
	 * @return the idPartenza
	 */
	public Integer getIdPartenza() {
		return idPartenza;
	}
	/**
	 * @param idPartenza the idPartenza to set
	 */
	public void setIdPartenza(Integer idPartenza) {
		this.idPartenza = idPartenza;
	}
	/**
	 * @return the idArrivo
	 */
	public Integer getIdArrivo() {
		return idArrivo;
	}
	/**
	 * @param idArrivo the idArrivo to set
	 */
	public void setIdArrivo(Integer idArrivo) {
		this.idArrivo = idArrivo;
	}
	/**
	 * @return the mediaVolo
	 */
	public Integer getMediaVolo() {
		return mediaVolo;
	}
	/**
	 * @param mediaVolo the mediaVolo to set
	 */
	public void setMediaVolo(Integer mediaVolo) {
		this.mediaVolo = mediaVolo;
	}
	
	

}
