package turing.edu.az.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private UUID id;

    @NotBlank(message = "Username must not be blank")
    @Pattern(regexp = ".*\\s.*", message = "Username must contain at least one space")
    private String username;

    @NotBlank(message = "Password must not be blank")
    private String password;

    @NotBlank(message = "Email must not be blank")
    @Email(message = "Email must be valid")
    @Pattern(regexp = ".*@.*", message = "Email must contain @ symbol")
    private String email;

    @NotBlank(message = "Phone must not be blank")
    private String phone;
}