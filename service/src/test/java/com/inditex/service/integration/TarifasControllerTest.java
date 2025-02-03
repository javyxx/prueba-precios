package com.inditex.service.integration;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@Sql({"/data.sql" })
class TarifasControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testObtenerTarifas_Caso1() throws Exception {
        mockMvc.perform(get("/tarifas")
                .param("fechaAplicacion", OffsetDateTime.of(2023, 6, 14, 10, 0, 0, 0, ZoneOffset.UTC).toString())
                .param("productoId", "35455")
                .param("cadenaId", "1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.precioFinal", is(25.45)))
                .andExpect(jsonPath("$.cadenaId", is(1)));
    }

    @Test
    void testObtenerTarifas_Caso2() throws Exception {
        mockMvc.perform(get("/tarifas")
                .param("fechaAplicacion", OffsetDateTime.of(2023, 6, 14, 16, 0, 0, 0, ZoneOffset.UTC).toString())
                .param("productoId", "35455")
                .param("cadenaId", "1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.precioFinal", is(25.45)))
                .andExpect(jsonPath("$.cadenaId", is(1)));
    }

    @Test
    void testObtenerTarifas_Caso3() throws Exception {
        mockMvc.perform(get("/tarifas")
                .param("fechaAplicacion", OffsetDateTime.of(2023, 6, 14, 21, 0, 0, 0, ZoneOffset.UTC).toString())
                .param("productoId", "35455")
                .param("cadenaId", "1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.precioFinal", is(25.45)))
                .andExpect(jsonPath("$.cadenaId", is(1)));
    }

    @Test
    void testObtenerTarifas_Caso4() throws Exception {
        mockMvc.perform(get("/tarifas")
                .param("fechaAplicacion", OffsetDateTime.of(2023, 6, 15, 10, 0, 0, 0, ZoneOffset.UTC).toString())
                .param("productoId", "35455")
                .param("cadenaId", "1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.precioFinal", is(38.95)))
                .andExpect(jsonPath("$.cadenaId", is(1)));
    }

    @Test
    void testObtenerTarifas_Caso5() throws Exception {
        mockMvc.perform(get("/tarifas")
                .param("fechaAplicacion", OffsetDateTime.of(2023, 6, 16, 21, 0, 0, 0, ZoneOffset.UTC).toString())
                .param("productoId", "35455")
                .param("cadenaId", "1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.precioFinal", is(35.5)))
                .andExpect(jsonPath("$.cadenaId", is(1)));
    }
}
