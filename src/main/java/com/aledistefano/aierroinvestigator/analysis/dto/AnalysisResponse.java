package com.aledistefano.aierroinvestigator.analysis.dto;

import java.util.List;

public record AnalysisResponse(
        String summary,
        String probableCause,
        List<String> evidence,
        List<String> suggestedActions,
        List<String> limitations
) {}
