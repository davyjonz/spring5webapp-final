package zw.co.ngoniutete.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import zw.co.ngoniutete.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
