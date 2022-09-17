using Kemberly01.DOMINIO;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Kemberly01.NEGOCIO // invocar clases y objetos con "namespace"

{
    class ClsLogin

     
    {
         ClsUsuario cls = new ClsUsuario();
        //Esto es un arreglo --> inician a cero          --    
        //String [] user = new string [3] {"Willian","Jenny","Eli"};
        //String [] pass = new string [3] {"12","123","1234"};

        // Creación de un objeto en c#
        //Login log = new Login(); 


        // public ---> hace referencia que se puede acceder desde otras clases
        // metodos ---> void -- no devuelve nada, int-- necesitan "return", boolean necesitan "return"

        //Este es un método
        public int acceso(Login log) {

            // Declaración de un estado
            int estado = 0;
            for (int i=0;i<cls.user.Length;i++){
            //Decisión
            if (log.Usuario.Equals(cls.user[i])&& log.Password.Equals(cls.pass[i])) {

                estado = 1;
            }
            }
            // 0 es igual a decir False, 1 representa True
            return estado;
        }












        /*public Boolean Ingresar(Login log) {
            if (log.Usuario.Equals("Kemberly") && log.Password.Equals("123"))
            {
                return true;
            }
            else {
                return false;
            }
        }
            */
        internal bool Ingresar(Login dom)
        {
            throw new NotImplementedException();
        }
    }





}

