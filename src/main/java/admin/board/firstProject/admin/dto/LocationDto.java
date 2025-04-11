package admin.board.firstProject.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LocationDto {
	// 위도 경도
	int locationNo;
	String latitudeNo;
	String longitudeNo;
	
}
