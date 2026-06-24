package com.duoc.guiasdespacho.dto;

import static com.duoc.guiasdespacho.config.CONSTANTS.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GuiaRequest {
    
    private Long id;
    
    @NotNull(message = "Debe ingresar el contenido del despacho")
    @NotBlank(message = "El contenido del despacho no puede ser un texto vacio")
    @Size(min = 3, max = 200, message = "El contenido del despacho debe tener entre 3 y 200 caracteres")
    private String contenido;

    @NotNull(message = "Debe ingresar la direccion de despacho")
    @NotBlank(message = "La direccion de despacho no puede ser un texto vacio")
    @Size(min = 3, max = 200, message = "La direccion de despacho debe tener entre 3 y 200 caracteres")
    private String direccion;

    @Pattern(regexp = DATEREGEXP, message = "La fecha debe ser ingresada en el formato " + DATEFORMAT)
    private String fecha;

    private Long transportista;

}
