package OneWayDev.tn.OneWayDev.dto.request;

import OneWayDev.tn.OneWayDev.Enum.StatusApplication;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data

public class ApplicationDto {

        private MultipartFile coverLetterFile;
        private MultipartFile cvFile;
        private StatusApplication statusApplication  ;
}
