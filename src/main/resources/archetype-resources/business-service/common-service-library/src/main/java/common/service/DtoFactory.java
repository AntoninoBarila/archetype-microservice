#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.common.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import ${package}.common.dto.generic.ServiceContextDTO;
import ${package}.common.dto.request.ContrattoRequestDTO;
import ${package}.common.dto.request.LoadRequestDTO;
import ${package}.common.dto.request.PrintRequestDTO;
import ${package}.common.dto.request.RenderRequestDTO;
import ${package}.common.dto.response.LoadResponseDTO;
import ${package}.common.type.PrintType;

@Service
public class DtoFactory {

	public LoadRequestDTO buildRequestLoad(ServiceContextDTO context, String abi, String evento, Long contratto,
			String servizioRapportoCollegato, String filialeRapportoCollegato, String rapportoCollegato,
			Date dataRiferimento, String canale, String format) {
		LoadRequestDTO request = new LoadRequestDTO();

		return request;
	}

	public LoadRequestDTO buildRequestLoad(ContrattoRequestDTO contrattoRequestDto) {
		LoadRequestDTO loadDTO = new LoadRequestDTO();

		return loadDTO;
	}

	public PrintRequestDTO buildRequestPrint(List<LoadResponseDTO> responseLoad, PrintType printType) {
		PrintRequestDTO request = new PrintRequestDTO();

		return request;
	}
	
	public RenderRequestDTO buildRequestRender(PrintRequestDTO printRequestDTO){
		RenderRequestDTO request = new RenderRequestDTO();
		return request;
		
	}
}