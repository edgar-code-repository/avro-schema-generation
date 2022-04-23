package avro.schema.generation.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookDTO {
	
	private String isbn;
	
	private String title;
	
	private int year;
	
	private List<AuthorDTO> authors;
	
}
