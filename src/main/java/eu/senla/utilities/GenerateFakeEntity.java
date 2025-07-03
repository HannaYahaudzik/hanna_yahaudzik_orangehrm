package eu.senla.utilities;

import com.github.javafaker.Faker;
import eu.senla.entity.Candidate;
import eu.senla.entity.Employee;
import eu.senla.entity.User;


public final class GenerateFakeEntity {

    private static final Faker FAKER = new Faker();

    public static User getUser() {
        return User.builder()
                .username(String.valueOf(FAKER.name().username()))
                .password(String.valueOf(FAKER.name()))
                .build();
    }

    public static Candidate getCandidate() {
        return Candidate.builder()
                .firstName(FAKER.name().firstName())
                .lastName(FAKER.name().lastName())
                .email(FAKER.internet().emailAddress())
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
