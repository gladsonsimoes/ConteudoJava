package com.company.orientacao_a_objetos.topicos_avancados._6_8_desafio_datas;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class CalculadoraGravidez {
    private Date dataUltimoPeriodoMenstrual;

    public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
        this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
    }

    private Calendar converterDateParaCalendar(Date data) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(data);
        return calendar;
    }

    public Date calcularDataEstimadaConcepcao() {
        // implementar cálculo de data estimada da concepção
        // 2 semanas após a data do último período menstrual
        return null;
    }

    public Date calcularDataEstimadaParto() {
        // implementar cálculo de data estimada para parto
        // 40 semanas após a data do último período menstrual
        return null;
    }
}

