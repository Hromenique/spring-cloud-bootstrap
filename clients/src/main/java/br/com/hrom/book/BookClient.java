package br.com.hrom.book;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("book-service")
public interface BookClient {

	@RequestMapping(method = RequestMethod.GET, value = "/books")
	List<Book> getAllBooks();
}
