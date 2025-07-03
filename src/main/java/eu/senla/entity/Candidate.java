package eu.senla.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Candidate {
    private String firstName;
    private String lastName;
    private String email;
}
