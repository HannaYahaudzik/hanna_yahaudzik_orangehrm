package eu.senla.utilities;

import com.github.javafaker.Faker;
import eu.senla.entities.Candidate;
import eu.senla.entities.Employee;
import eu.senla.entities.User;


public final class GenerateFakeEntity {

    public static final Faker FAKER = new Faker();

    public static User getUser() {
        return User.builder()
                .username(String.valueOf(FAKER.name().username()))
                .password(String.valueOf(FAKER.name()))
                .build();
    }

    public static Candidate getCandidateRequiredFieldOnly() {
        return Candidate.builder()
                .firstName(FAKER.name().firstName())
                .lastName(FAKER.name().lastName())
                .email(FAKER.internet().emailAddress())
                .build();
    }

    public static Candidate getCandidateAllArgs() {
        return Candidate.builder()
                .firstName(FAKER.name().firstName())
                .middleName(FAKER.name().name())
                .lastName(FAKER.name().lastName())
                .email(FAKER.internet().emailAddress())
                .contactNumber(FAKER.phoneNumber().subscriberNumber())
                .keywords(FAKER.job().keySkills())
                .build();
    }

    public static Employee getEmployee() {
        return Employee.builder()
                .firstName(FAKER.name().firstName())
                .middleName(FAKER.name().name())
                .lastName(FAKER.name().lastName())
                .build();
    }

    private GenerateFakeEntity() {
    }
}
