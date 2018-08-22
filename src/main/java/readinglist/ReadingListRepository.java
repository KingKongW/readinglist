package readinglist;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author wzm
 * @date 18-8-21
 */
public interface ReadingListRepository extends CrudRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
