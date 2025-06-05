package TODO.API.dto;

import jakarta.validation.constraints.NotBlank;

public record TaskRequestDTO(@NotBlank String title, String description, Boolean completed) {
}
