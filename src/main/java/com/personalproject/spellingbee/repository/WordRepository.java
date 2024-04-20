package com.personalproject.spellingbee.repository;
import com.personalproject.spellingbee.model.Word;
import org.springframework.data.repository.CrudRepository;

public interface WordRepository extends CrudRepository<Word, Long> {

}
