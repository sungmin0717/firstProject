package admin.board.firstProject.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BannerDto {
	// 배너
	int bannerNo;
	String bannerPicture;
	String bannerText;

}
