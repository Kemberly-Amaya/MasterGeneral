using Kemberly01.DOMINIO;
using Kemberly01.NEGOCIO;
using Kemberly01.VISTA;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Kemberly01
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            //Tipo de evento a utilizar es Click

            // Invocar Login -- se instacia Login
            Login log = new Login();

            // Capturar datos que vienen del teclado en C#
            log.Usuario = txtUser.Text;
            log.Password = txtPassword.Text;

            ClsLogin clsL = new ClsLogin();

            int variabledeevaluacion = clsL.acceso(log);

            if (variabledeevaluacion == 1)
            {
                MessageBox.Show("Bienvenido");
                FrmMenu frm = new FrmMenu();

                //Abrir formulario
                frm.Show();

                //Funcion para esconder formulario "Hide"---- >ocultar visibilidad del formulario al usuario
                 this.Hide();

                // Funcion para  esconder formulario "Dispose" --> Trabaja con la Ram y lo desaparece
                //this.Dispose();
            }
            else { 
                MessageBox.Show("Error");
            }
            //Mostrar un mensaje en pantalla
            // MessageBox.Show("ENTER");

        }

       
        private void txtUser_TextChanged(object sender, EventArgs e)
        {

        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {

            //this-----> significa que se podra utilizar todos
            //los elementos de esta clase, es decir dentro de los namespace, seria la clase 
            // Form1
            //Cerrar una aplicacion 

            this.Close();

        }
    }


}