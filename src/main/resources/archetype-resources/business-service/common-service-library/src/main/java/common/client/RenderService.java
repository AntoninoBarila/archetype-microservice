#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.common.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ${package}.common.dto.request.RenderRequestDTO;
import ${package}.common.dto.response.RenderResponseDTO;

@FeignClient("dp-render-service")
public interface RenderService {

	@RequestMapping(value="/render/", method=RequestMethod.POST)
	public List<RenderResponseDTO> render(@RequestBody RenderRequestDTO renderDTO);
}
