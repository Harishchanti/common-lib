package com.ailiens.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.net.URI;

/**
 * Created by jayant on 13/3/17.
 */

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class UriInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    URI uri;
    String method="POST";
    int timeout=60;
}
