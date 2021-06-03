package kodlamaio.Hrms.entities.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto {
    private String companyName;
    private String jobPosition;
    private int openPositionCount;
    private LocalDate createDate;
    private LocalDate applicationDeadline;
    
}
