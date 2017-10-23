#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.common.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ${package}.common.dto.request.PrintRequestDTO;
import ${package}.common.dto.response.PrintResponseDTO;

@FeignClient("dp-print-service")
public interface PrintService {
	
	@RequestMapping(method = RequestMethod.POST, value = "/print/")
	List<PrintResponseDTO> print(@RequestBody PrintRequestDTO printDto);
}
