package com.example.cashcard;

import org.springframework.data.annotation.Id;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

record CashCard(@Id Long id, @NotNull @Positive Double amount, String owner) {

}
