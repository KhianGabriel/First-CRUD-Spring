package com.example.crud.domain.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestProductCreate(
    @NotBlank
    String name,
    @NotNull
    Float price_in_cents) {}
