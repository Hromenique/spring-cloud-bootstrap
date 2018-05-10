package br.com.hrom.clients.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feignclient")
public class FeignClientController {

	@Autowired
	private BookClient bookClient;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Book> getBooks(){

		return bookClient.getAllBooks();
	}
}
