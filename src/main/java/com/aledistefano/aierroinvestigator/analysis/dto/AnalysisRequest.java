package com.aledistefano.aierroinvestigator.analysis.dto;

import jakarta.validation.constraints.NotBlank;

public record AnalysisRequest(
        @NotBlank String stackTrace,
        @NotBlank String businessOperation,
        String sourceCode
) {}