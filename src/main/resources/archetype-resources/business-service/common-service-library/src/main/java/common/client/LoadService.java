#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.common.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import ${package}.common.dto.request.LoadRequestDTO;
import ${package}.common.dto.response.LoadResponseDTO;

@FeignClient("dp-load-service")
public interface LoadService {
	@RequestMapping("/load/")
	public List<LoadResponseDTO> load(@RequestBody LoadRequestDTO loadDto);
}
