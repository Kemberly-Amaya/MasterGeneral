namespace Proyecto_Suma.GUI
{
    partial class frmVista
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.btnSumar = new System.Windows.Forms.Button();
            this.txtDato1 = new System.Windows.Forms.TextBox();
            this.txtDato2 = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // btnSumar
            // 
            this.btnSumar.Location = new System.Drawing.Point(72, 263);
            this.btnSumar.Name = "btnSumar";
            this.btnSumar.Size = new System.Drawing.Size(112, 34);
            this.btnSumar.TabIndex = 0;
            this.btnSumar.Text = "Sumar";
            this.btnSumar.UseVisualStyleBackColor = true;
            this.btnSumar.Click += new System.EventHandler(this.btnSumar_Click);
            // 
            // txtDato1
            // 
            this.txtDato1.Location = new System.Drawing.Point(62, 112);
            this.txtDato1.Name = "txtDato1";
            this.txtDato1.Size = new System.Drawing.Size(150, 31);
            this.txtDato1.TabIndex = 1;
            // 
            // txtDato2
            // 
            this.txtDato2.Location = new System.Drawing.Point(62, 174);
            this.txtDato2.Name = "txtDato2";
            this.txtDato2.Size = new System.Drawing.Size(150, 31);
            this.txtDato2.TabIndex = 2;
            // 
            // frmVista
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(10F, 25F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(281, 356);
            this.Controls.Add(this.txtDato2);
            this.Controls.Add(this.txtDato1);
            this.Controls.Add(this.btnSumar);
            this.Name = "frmVista";
            this.Text = "frmVista";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnSumar;
        private System.Windows.Forms.TextBox txtDato1;
        private System.Windows.Forms.TextBox txtDato2;
    }
}