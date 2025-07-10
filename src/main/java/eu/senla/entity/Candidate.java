package eu.senla.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Builder
@Getter
public class Candidate {
    @NonNull
    private String firstName;
    private String middleName;
    @NonNull
    private String lastName;
    private String vacancy;
    @NonNull
    private String email;
    private String contactNumber;
    private String keywords;
    private String notes;
    private Boolean keepData;
}
