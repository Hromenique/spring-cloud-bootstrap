package br.com.hrom.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;

@RestController
@RequestMapping("/resttemplate")
public class RestTemplateController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Book> getBooks(){

		RequestEntity request = RequestEntity
				.get(URI.create("http://book-service/books"))
				.accept(APPLICATION_JSON_UTF8).build();

		return restTemplate.exchange(request, new ParameterizedTypeReference<List<Book>>() {
		}).getBody();
	}
}
