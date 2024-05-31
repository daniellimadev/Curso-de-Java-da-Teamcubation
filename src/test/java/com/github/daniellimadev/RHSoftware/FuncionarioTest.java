package com.github.daniellimadev.RHSoftware;

import com.github.daniellimadev.POO.RHSoftware.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FuncionarioTest {

    @Test
    void aumentarSalarioPorPorcentual() {
        Funcionario funcionario = new Funcionario(1, "João Silva","261.754.210-60",3000.00);
        funcionario.aumentarSalarioPorPercentual(10);
        Assertions.assertEquals(3300.00, funcionario.getSalario());
    }
}
