package com.acmetravel.vacation.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VacationTest {

    @Test
    void deveInstanciarAclasse() {

        var vacation = new Vacation("Nome das ferias", "Descricao das ferias");

        assertThat(vacation).isInstanceOf(Vacation.class);
        assertThat(vacation.getNome()).isNotBlank();
    }

}