package ch15;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Board {
	
	private String subject;
	private String content;
	private String writer;

}
