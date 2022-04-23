package avro.schema.generation;

import java.io.IOException;

import org.apache.avro.Schema;
import org.apache.avro.reflect.ReflectData;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import avro.schema.generation.dto.BookDTO;

public class AvroGenerationMain {

	public static void main(String[] args) throws JsonProcessingException, IOException {

		ReflectData reflectData = ReflectData.get();
		
		Schema schema = reflectData.getSchema(BookDTO.class);
        ObjectMapper mapper = new ObjectMapper();
        JsonNode json = mapper.readTree(schema.toString());
		
        PrettyPrinter prettyPrinter = new DefaultPrettyPrinter();        
        String strJson = mapper.writer(prettyPrinter).writeValueAsString(json);
        System.out.println(strJson);	        

	}

}
