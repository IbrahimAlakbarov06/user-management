package turing.edu.az.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id", columnDefinition = "UUID")
    private UUID id;

    @NotBlank(message = "Username must not be blank")
    @Pattern(regexp = "^\\S+$", message = "Username must not contain spaces")
    @Column(unique = true)
    private String username;

    @NotBlank(message = "Password must not be blank")
    private String password;

    @NotBlank(message = "Email must not be blank")
    @Email(message = "Email must be valid")
    @Column(unique = true)
    private String email;

    @NotBlank(message = "Phone must not be blank")
    @Column(unique = true)
    private String phone;
}