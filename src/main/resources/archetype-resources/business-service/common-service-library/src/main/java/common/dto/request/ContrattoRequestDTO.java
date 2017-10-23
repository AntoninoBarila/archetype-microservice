#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.common.dto.request;

import java.io.Serializable;
import java.util.Date;

import ${package}.common.dto.generic.ServiceContextDTO;

public class ContrattoRequestDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4029620550214551505L;
	
	private ServiceContextDTO context;
	private String abi;
	private String evento;
	private Long contratto;
	private String servizioRapportoCollegato;
	private String filialeRapportoCollegato;
	private String rapportoCollegato;
	private Date dataRiferimento;
	private String canale;
	private String format;
	public ServiceContextDTO getContext() {
		return context;
	}
	public void setContext(ServiceContextDTO context) {
		this.context = context;
	}
	public String getAbi() {
		return abi;
	}
	public void setAbi(String abi) {
		this.abi = abi;
	}
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
	public Long getContratto() {
		return contratto;
	}
	public void setContratto(Long contratto) {
		this.contratto = contratto;
	}
	public String getServizioRapportoCollegato() {
		return servizioRapportoCollegato;
	}
	public void setServizioRapportoCollegato(String servizioRapportoCollegato) {
		this.servizioRapportoCollegato = servizioRapportoCollegato;
	}
	public String getFilialeRapportoCollegato() {
		return filialeRapportoCollegato;
	}
	public void setFilialeRapportoCollegato(String filialeRapportoCollegato) {
		this.filialeRapportoCollegato = filialeRapportoCollegato;
	}
	public String getRapportoCollegato() {
		return rapportoCollegato;
	}
	public void setRapportoCollegato(String rapportoCollegato) {
		this.rapportoCollegato = rapportoCollegato;
	}
	public Date getDataRiferimento() {
		return dataRiferimento;
	}
	public void setDataRiferimento(Date dataRiferimento) {
		this.dataRiferimento = dataRiferimento;
	}
	public String getCanale() {
		return canale;
	}
	public void setCanale(String canale) {
		this.canale = canale;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	
	

}
