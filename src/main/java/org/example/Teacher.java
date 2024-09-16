package org.example;

import lombok.Builder;
import lombok.With;

@Builder
@With
public record Teacher(int id, String name, String subject) {
}
