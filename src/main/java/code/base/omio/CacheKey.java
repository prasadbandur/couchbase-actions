package code.base.omio;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CacheKey {

    private String provider;

    private Long departurePositionId;

    private Long arrivalPositionId;

    private LocalDate departureDate;

    private LocalDate returnDate;

    private int seniorCount;

    private int adultCount;

    private int youthCount;

    private int childCount;

    private int infantCount;

    private String discountCardHash;

    private String abParameterHash;

}
