using Proyecto_Suma.Dominio;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace Proyecto_Suma.GUI
{
    public partial class frmVista : Form
    {
        public frmVista()
        {
            InitializeComponent();
        }

        private void btnSumar_Click(object sender, EventArgs e)
        {
            // Capturar datos y convertirlos a enteros 
            // Convert.ToInt32("variable a convertir");
            //Tex hace la función de get
            int n1 = Convert.ToInt32(txtDato1.Text);
            int n2 = Convert.ToInt32(txtDato2.Text);

            //Objeto de tipo Suma
            Suma Sum = new Suma();

            //Enviar el dato de n1 y n2 a los atributos de la clase Suma

            Sum.Dato1 = n1;
            Sum.Dato2 = n2;

            //

            MessageBox.Show(Convert.ToString(Sum.Dato1, Sum.Dato2));
        }
    }
}
