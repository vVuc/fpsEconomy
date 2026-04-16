package com.thiago.fpseconomy.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class MatchRequestDTO {
    @NotNull
    @Min(1)
    private Integer currentRound;

    @NotNull
    private Integer ChangeRound;
}
