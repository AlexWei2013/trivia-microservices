package trivia.ui.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class AuthTokenDetailsDTO {
	public String userId;
	public String email;
	public List<String> roleNames;

	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
	public Date expirationDate;
}
