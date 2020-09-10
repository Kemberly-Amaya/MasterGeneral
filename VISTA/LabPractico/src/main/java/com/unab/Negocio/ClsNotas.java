package com.unab.Negocio;

import com.unab.Dominio.Notas;
import com.unab.clase02.labpractico.frmCalPromedioDeNotas;

public class ClsNotas {

    frmCalPromedioDeNotas CalcdePromedio = new frmCalPromedioDeNotas();

    public Double CalPromedio1(Notas note1) {

        Double LaboratorioI = Double.parseDouble(note1.getLab1()) * 0.40;
        Double Parcial1 = Double.parseDouble(note1.getPar1()) * 0.60;

        Double resultado = LaboratorioI + Parcial1;
        resultado /= 3;

        note1.setCal1(resultado);
        return resultado;

    }

    public Double CalPromedio2(Notas note1) {

        Double LaboratorioII = Double.parseDouble(note1.getLab2()) * 0.40;
        Double Parcial2 = Double.parseDouble(note1.getPar2()) * 0.60;

        Double resultado = LaboratorioII + Parcial2;
        resultado /= 3;

        note1.setCal2(resultado);
        return resultado;

    }

    public Double CalPromedio3(Notas note1) {

        Double Laboratorio3 = Double.parseDouble(note1.getLab3()) * 0.40;
        Double Parcial3 = Double.parseDouble(note1.getPar3()) * 0.60;

        Double resultado = Laboratorio3 + Parcial3;
        resultado /= 3;

        note1.setCal3(resultado);
        return resultado;

    }
    Double Total = 0.0;
    //Funciones 

    public void ResultadoFinal(Notas note1) {

        Double notafinal = 0.0;
        notafinal = note1.getCal1() + note1.getCal2() + note1.getCal3();
        //mandar la nota final
        note1.setPromFinal(notafinal);
        this.Total = notafinal;
    }

    public String notafinalTotal() {
        if (Total >= 6) {
            return "Materia Aprobada";
        } else {
            return "Materia Reprobada";
        }

    }
}
